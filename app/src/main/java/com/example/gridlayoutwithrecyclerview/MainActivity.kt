package com.example.gridlayoutwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.gridlayoutwithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var movieRecyclerViewAdapter: RecyclerViewMovieAdapter? = null
    private var movieList = ArrayList<MovieModel>()
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        recyclerView = mainBinding.rvMovieLists
        movieRecyclerViewAdapter = RecyclerViewMovieAdapter( movieList)
        val layoutManager: LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieRecyclerViewAdapter

        prepareMovieListData()

    }

    private fun prepareMovieListData() {
        var movie = MovieModel("Avatar", R.drawable.avatar)
        movieList.add(movie)
        movie = MovieModel("Batman", R.drawable.batman)
        movieList.add(movie)

        movie = MovieModel("End Game", R.drawable.end_game)
        movieList.add(movie)
        movie = MovieModel("Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = MovieModel("Inception", R.drawable.inception)
        movieList.add(movie)
        movie = MovieModel("Jumanji", R.drawable.jumanji)
        movieList.add(movie)
        movie = MovieModel("Lucy", R.drawable.lucy)
        movieList.add(movie)
        movie = MovieModel("Jurassic World", R.drawable.jurassic_world)
        movieList.add(movie)
        movie = MovieModel("Spider Man", R.drawable.spider_man)
        movieList.add(movie)
        movie = MovieModel("Venom", R.drawable.venom)
        movieList.add(movie)

        movieRecyclerViewAdapter!!.notifyDataSetChanged()
    }
}