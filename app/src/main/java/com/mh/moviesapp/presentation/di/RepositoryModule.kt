package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.data.MovieRepositoryImpl
import com.mh.moviesapp.data.datasource.MovieCacheDataSource
import com.mh.moviesapp.data.datasource.MovieLocalDataSource
import com.mh.moviesapp.data.datasource.MovieRemoteDataSource
import com.mh.moviesapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieCacheDataSource: MovieCacheDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )

    }
}