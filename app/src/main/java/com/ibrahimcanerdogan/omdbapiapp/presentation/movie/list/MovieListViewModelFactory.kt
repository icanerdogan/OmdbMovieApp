package com.ibrahimcanerdogan.omdbapiapp.presentation.movie.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.omdbapiapp.domain.usecase.GetMoviesUseCase
import com.ibrahimcanerdogan.omdbapiapp.domain.usecase.GetSelectMovieUseCase
import com.ibrahimcanerdogan.omdbapiapp.domain.usecase.UpdateMoviesUseCase
import com.ibrahimcanerdogan.omdbapiapp.presentation.movie.detail.MovieDetailActivity

class MovieListViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MovieListViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}