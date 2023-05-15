package com.mh.moviesapp.data.datasourceimplementation

import com.mh.moviesapp.data.datasource.MovieLocalDataSource
import com.mh.moviesapp.data.db.MovieDAO
import com.mh.moviesapp.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl (private val movieDAO: MovieDAO): MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDAO.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDAO.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDAO.deleteAllMovies()
        }
    }
}