package com.mh.moviesapp.domain.repository

import com.mh.moviesapp.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}