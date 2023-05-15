package com.mh.moviesapp.data.datasourceimplementation

import com.mh.moviesapp.data.api.TMDBService
import com.mh.moviesapp.data.datasource.MovieRemoteDataSource
import com.mh.moviesapp.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}