package com.mh.moviesapp.data.datasource

import com.mh.moviesapp.data.model.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>

    suspend fun saveMoviesToDB(movies: List<Movie>)

    suspend fun clearAll()
}