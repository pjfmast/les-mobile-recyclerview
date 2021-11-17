package com.avans.avd.lesrecyclerview.uitl

import android.content.Context
import android.widget.ImageView
import com.avans.avd.lesrecyclerview.R
import com.bumptech.glide.Glide

class GlideImageLoader(private val context: Context) : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .centerCrop()
            .placeholder(R.drawable.loading_animation)
            .into(imageView)
    }
}