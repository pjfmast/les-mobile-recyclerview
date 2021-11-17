package com.avans.avd.lesrecyclerview.uitl

import android.widget.ImageView

interface ImageLoader {
    fun loadImage(imageUrl: String, imageView: ImageView)
}