package com.mh.moviesapp.presentation.di

import android.content.Context
import androidx.room.Room
import com.mh.moviesapp.data.api.TMDBService
import com.mh.moviesapp.data.db.MovieDAO
import com.mh.moviesapp.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdbclient")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDAO {
        return tmdbDatabase.movieDAO()
    }
}