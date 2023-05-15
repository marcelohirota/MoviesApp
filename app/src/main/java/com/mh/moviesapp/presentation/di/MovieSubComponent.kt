package com.mh.moviesapp.presentation.di

import com.mh.moviesapp.presentation.MainActivity
import dagger.Subcomponent


@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {

    fun inject(movieActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }

}