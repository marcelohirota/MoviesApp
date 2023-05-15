package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.data.api.TMDBService
import com.mh.moviesapp.data.datasource.MovieRemoteDataSource
import com.mh.moviesapp.data.datasourceimplementation.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule (private val apiKey: String){

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }

}