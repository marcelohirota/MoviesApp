package com.mh.moviesapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mh.moviesapp.domain.usecases.GetMoviesUseCase
import com.mh.moviesapp.domain.usecases.UpdateMoviesUseCase

class ViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MyViewModel(getMoviesUseCase, updateMoviesUseCase) as T
    }

}