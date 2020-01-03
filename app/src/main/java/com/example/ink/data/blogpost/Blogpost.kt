package com.example.ink.data.blogpost

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "blogpost")
@Parcelize
data class Blogpost (

    @ColumnInfo(name = "bCategory")
    var category: String?,

    @ColumnInfo(name = "bTitle")
    var title: String?,

    @ColumnInfo(name = "bDate")
    var date: String?,

    @ColumnInfo(name = "bCount")
    var viewCount: Int?,

    @ColumnInfo(name = "bContent")
    var blogContent: String?,

    @ColumnInfo(name = "image")
    var blogImage: String?

): Parcelable{
    @PrimaryKey(autoGenerate = true)
    var id: Int =0
}