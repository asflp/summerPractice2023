package com.example.homework3

import android.media.Image
import java.io.File

data class Song (
    val id: Int,
    val url: String,
    val name: String,
    val singer: String,
    val description: String,
    val picture: Int
    )