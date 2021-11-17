package com.avans.avd.lesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.avans.avd.lesrecyclerview.adapter.CatsAdapter
import com.avans.avd.lesrecyclerview.adapter.MovieAdapter
import com.avans.avd.lesrecyclerview.data.TestDatasources
import com.avans.avd.lesrecyclerview.uitl.CoilImageLoader

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set recyclerview layout:
        val recyclerView: RecyclerView = findViewById(R.id.main_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // connect Cat-adapter to recyclerview:
//        val catsAdapter = CatsAdapter(layoutInflater, CoilImageLoader())
//        catsAdapter.setData(TestDatasources().loadCats())
//        recyclerView.adapter = catsAdapter

        // connect movie-adapter to recyclerview:
        val movieAdapter = MovieAdapter(layoutInflater, CoilImageLoader())
        movieAdapter.setData(TestDatasources().loadMovies())
        recyclerView.adapter = movieAdapter
    }
}