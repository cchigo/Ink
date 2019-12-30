package com.example.ink.data.blogpost

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BlogpostDao {

    @Query("SELECT * FROM blogpost")
    fun selectBlogpost():LiveData<List<Blogpost>>

    @Insert
    fun insertBlogpost(blogpost: Blogpost)

    @Update
    fun updateContact(blogpost: Blogpost)

    @Delete
    fun deleteBlogPost(blogpost: Blogpost)
}