package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.data.datasource.MovieCacheDataSource
import com.mh.moviesapp.data.datasourceimplementation.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }
}