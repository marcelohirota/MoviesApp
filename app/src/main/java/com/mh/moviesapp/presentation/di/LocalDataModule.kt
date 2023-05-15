package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.data.datasource.MovieLocalDataSource
import com.mh.moviesapp.data.datasourceimplementation.MovieLocalDataSourceImpl
import com.mh.moviesapp.data.db.MovieDAO
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule{

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDAO: MovieDAO): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDAO)
    }
}