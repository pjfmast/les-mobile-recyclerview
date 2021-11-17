package com.avans.avd.lesrecyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.avans.avd.lesrecyclerview.R
import com.avans.avd.lesrecyclerview.model.MovieUiModel
import com.avans.avd.lesrecyclerview.uitl.ImageLoader

class MovieAdapter(
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    companion object {
        // indien je aantal aanroepen van onCreateViewHolder en onBindViewHolder wil testen:
        // - maak de collectie van items minstens 2 keer zo groot dan zichtbaar in de View
        private val TAG = MovieAdapter::class.qualifiedName
        private var onCreateNr = 0
        private var onBindNr = 0
    }

    private val movieData = mutableListOf<MovieUiModel>()
    fun setData(catsData: List<MovieUiModel>) {
        this.movieData.clear()
        this.movieData.addAll(catsData + catsData) // for testing nr of calls ensure enough data
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
            imageLoader.loadImage(movieData.poster, moviePoster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        // wordt maximaal: aantal items op scherm + 3 boven en 3 onder
        Log.i(TAG, "onCreateViewHolder: called ${++onCreateNr}")
        val view = layoutInflater.inflate(R.layout.item_movie, parent, false)
        return  MovieViewHolder(view)
    }


    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        // aantal wordt steeds hoger als we op en neer scrollen:
        Log.i(TAG, "onBindViewHolder: called ${++onBindNr}")
        holder.bindData(movieData[position])
    }

    override fun getItemCount(): Int = movieData.size
}