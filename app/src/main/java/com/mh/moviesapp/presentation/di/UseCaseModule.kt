package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.domain.repository.MovieRepository
import com.mh.moviesapp.domain.usecases.GetMoviesUseCase
import com.mh.moviesapp.domain.usecases.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }
}