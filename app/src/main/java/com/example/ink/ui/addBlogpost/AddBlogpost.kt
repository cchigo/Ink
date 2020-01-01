package com.example.ink.ui.addBlogpost

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.example.ink.R
import com.example.ink.data.blogpost.Blogpost
import com.example.ink.databinding.ActivityAddBlogpostBinding
import com.example.ink.ui.blogList.BlogViewModel
import kotlinx.android.synthetic.main.activity_add_blogpost.*
import java.text.SimpleDateFormat
import java.util.*


class AddBlogpost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blogpost)

        //gets the toolbar view inside the add blogpost activity layout
        var toolbar: Toolbar = toolbar
        setSupportActionBar(toolbar)



        var binding = ActivityAddBlogpostBinding.inflate(layoutInflater)
        val model = ViewModelProviders.of(this)[BlogViewModel::class.java]

        binding.toolbar.setOnClickListener{
            var title = binding.newblogpostTitle.toString()
            var category = binding.newblogpostCategory.toString()
            var content = binding.newblogpost.toString()

            val currentDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
            val viewCount = 20


            //val blogpost = Blogpost(category, title, date = currentDate, viewCount = viewCount, content )
            val blogpost = Blogpost(category, title, currentDate,viewCount,content, "https://picsum.photos/id/1067/64/60.jpg")

            model.setBlogposts(blogpost, this)

        }


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var id: Int = item.itemId

        if(id == R.id.postButton_id){
            Toast.makeText(applicationContext, "you clicked send", Toast.LENGTH_LONG).show()
        }
        return true
    }
//    override fun getViewCount(view: View): Boolean {
//        var id: Int = view.
//    }


}


