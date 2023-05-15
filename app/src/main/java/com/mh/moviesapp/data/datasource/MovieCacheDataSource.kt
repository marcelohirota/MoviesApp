package com.mh.moviesapp.data.datasource

import com.mh.moviesapp.data.model.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movies: List<Movie>)

}