package com.example.ink.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "blogpost")
@Parcelize
data class Blogpost (
    @PrimaryKey(autoGenerate = true)
    var id: Int =0,

    @ColumnInfo(name = "bCategory")
    var category: String?,

    @ColumnInfo(name = "bTitle")
    var title: String?,

    @ColumnInfo(name = "bDate")
    var date: String?,

    @ColumnInfo(name = "bCount")
    var viewCount: String?,

    @ColumnInfo(name = "bContent")
    var blogContent: String?,

    @ColumnInfo(name = "image")
    var blogImage: String?

): Parcelable