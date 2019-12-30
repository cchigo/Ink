package com.example.ink.ui.blogList

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ink.data.blogpost.Blogpost
import com.example.ink.databinding.BlogpostRowBinding
import com.example.ink.ui.blogList.BlogAdapter.BlogViewHolder
import com.example.ink.utils.OnItemClickListener

class BlogAdapter (val onItemClickListener: OnItemClickListener, val context: Context): RecyclerView.Adapter<BlogViewHolder>() {

    var blogpost: List<Blogpost> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding = BlogpostRowBinding.inflate(layoutInflater,parent, false)
        return BlogViewHolder(binding)
    }

    override fun getItemCount(): Int {
    return blogpost.size
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
       val blogpost = blogpost.get(position)
        holder.bind(blogpost, onItemClickListener)

        holder.binding.deleteId.setOnClickListener{
        }
    }

    class BlogViewHolder(var binding: BlogpostRowBinding) :RecyclerView.ViewHolder(binding.root){

        fun bind(blogpost: Blogpost, onItemClickListener: OnItemClickListener){
            binding.blogpost = blogpost
            binding.root.setOnClickListener{
                onItemClickListener.onItemClick(blogpost)
            }
            binding.executePendingBindings()

        }

    }
}