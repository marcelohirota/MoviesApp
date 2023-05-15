package com.mh.moviesapp.data.datasource

import com.mh.moviesapp.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}