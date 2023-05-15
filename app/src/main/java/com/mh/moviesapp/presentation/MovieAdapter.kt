package com.mh.moviesapp.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mh.moviesapp.R
import com.mh.moviesapp.data.model.Movie
import com.mh.moviesapp.databinding.ListItemBinding

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    private var movies = ArrayList<Movie>()

    fun setList(movies: List<Movie>) {
        this.movies.clear()
        this.movies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    class MyViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){

            fun bind(movie: Movie){
                binding.movieTitleTV.text = movie.title
                binding.descriptionTV.text = movie.overview

                val posterURL = "https://image.tmdb.org/t/p/w500"+movie.posterPath

                Glide.with(binding.imageView.context)
                    .load(posterURL)
                    .into(binding.imageView)

            }
    }
}