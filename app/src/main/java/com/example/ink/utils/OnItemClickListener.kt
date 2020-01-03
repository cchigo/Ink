package com.example.ink.utils

import com.example.ink.data.blogpost.Blogpost

interface OnItemClickListener {
    fun onItemClick(blogpost: Blogpost)
}