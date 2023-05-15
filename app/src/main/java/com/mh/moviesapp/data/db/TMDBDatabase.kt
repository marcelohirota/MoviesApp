package com.mh.moviesapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mh.moviesapp.data.model.Movie

@Database(
    entities = [Movie::class], version = 1, exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {

    abstract fun movieDAO(): MovieDAO
}