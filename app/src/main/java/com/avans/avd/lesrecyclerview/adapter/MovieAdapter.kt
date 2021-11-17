package com.avans.avd.lesrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.avans.avd.lesrecyclerview.R
import com.avans.avd.lesrecyclerview.model.MovieUiModel

class MovieAdapter(
    private val layoutInflater: LayoutInflater,
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val movieData = mutableListOf<MovieUiModel>()
    fun setData(catsData: List<MovieUiModel>) {
        this.movieData.clear()
        this.movieData.addAll(catsData)
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(
        containerView: View,
    ) : RecyclerView.ViewHolder(containerView) {
        val movieTitle:TextView = containerView.findViewById(R.id.item_movie_title)
        val movieType:TextView = containerView.findViewById(R.id.item_movie_type)
        val moviePoster: ImageView = containerView.findViewById(R.id.item_movie_image)

        fun bindData(movieData: MovieUiModel){
            movieTitle.text = "${movieData.title} (${movieData.year})"
            movieType.text = movieData.type
            moviePoster.load(movieData.poster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("Not yet implemented")
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = movieData.size
}