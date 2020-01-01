package com.example.ink.ui.addBlogpost

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.example.ink.R
import com.example.ink.databinding.ActivityAddBlogpostBinding
import com.example.ink.ui.blogList.BlogViewModel
import kotlinx.android.synthetic.main.activity_add_blogpost.*


class AddBlogpost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blogpost)

        //gets the toolbar view inside the add blogpost activity layout
        var toolbar: Toolbar = toolbar
        setSupportActionBar(toolbar)

        var binding = ActivityAddBlogpostBinding.inflate(layoutInflater)
        val model = ViewModelProviders.of(this)[BlogViewModel::class.java]



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


}


