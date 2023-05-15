package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.domain.usecases.GetMoviesUseCase
import com.mh.moviesapp.domain.usecases.UpdateMoviesUseCase
import com.mh.moviesapp.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): ViewModelFactory {
        return ViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}