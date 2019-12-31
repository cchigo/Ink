package com.example.ink.ui.addBlogpost

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.ink.R
import kotlinx.android.synthetic.main.activity_add_blogpost.*


class AddBlogpost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blogpost)

        //gets the toolbar view inside the add blogpost activity layout
        var toolbar: Toolbar = toolbar
        setSupportActionBar(toolbar)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

}


