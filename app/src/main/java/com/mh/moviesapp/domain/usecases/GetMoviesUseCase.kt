package com.mh.moviesapp.domain.usecases

import com.mh.moviesapp.data.model.Movie
import com.mh.moviesapp.domain.repository.MovieRepository

class GetMoviesUseCase (private val movieRepository: MovieRepository){

    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}