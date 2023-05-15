package com.mh.moviesapp.data.datasourceimplementation

import com.mh.moviesapp.data.datasource.MovieCacheDataSource
import com.mh.moviesapp.data.model.Movie

class MovieCacheDataSourceImpl: MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
    
}