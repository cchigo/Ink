package com.example.ink.ui.blogList

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ink.data.blogpost.Blogpost
import com.example.ink.data.blogpost.BlogpostDatabase

class BlogViewModel: ViewModel() {
    private val blogpost: MutableLiveData<List<Blogpost>> by lazy {
        MutableLiveData<List<Blogpost>>().also {
            loadBlogposts()
        }
    }
    fun getBlogposts(context: Context): LiveData<List<Blogpost>> {
        return BlogpostDatabase.getInstance(context).blogpostDAO().selectBlogpost()
    }
    fun setBlogposts(blogpost: Blogpost, context: Context){

            return BlogpostDatabase.getInstance(context).blogpostDAO().insertBlogpost(blogpost)

    }

    private fun loadBlogposts() {

    }


    fun deleteBlogposts(blogpost: Blogpost, context: Context){
        return BlogpostDatabase.getInstance(context).blogpostDAO().deleteBlogPost(blogpost)

    }


}