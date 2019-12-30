package com.example.ink.data.blogpost

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Blogpost::class], version = 1)
abstract class BlogpostDatabase: RoomDatabase() {

    abstract fun blogpostDAO(): BlogpostDao

    companion object {
        private var instance : BlogpostDatabase? = null
        fun getInstance(context: Context): BlogpostDatabase {
            if (instance == null){

                instance = Room.databaseBuilder(context, BlogpostDatabase::class.java, "blogpost")
                            .allowMainThreadQueries()
                            .build()
                return instance!!

            }else{
                return instance!!
            }
        }
    }
}