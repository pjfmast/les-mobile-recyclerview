package com.avans.avd.lesrecyclerview.uitl

import android.widget.ImageView
import coil.load
import com.avans.avd.lesrecyclerview.R

class CoilImageLoader : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        imageView.load(imageUrl) {
            crossfade(true)
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }
}