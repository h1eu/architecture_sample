package com.example.architecture_sample_app.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.architecture_sample_app.data.local.room.entity.KPopIdolEntity
import com.example.architecture_sample_app.data.repository.KPopIdolRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val kPopRepository: KPopIdolRepository
): ViewModel() {

    fun addKPopIdol(kPopIdol: KPopIdolEntity){
        viewModelScope.launch {
            kPopRepository.add(kPopIdol)
        }
    }
}

sealed interface HomeModelUiState{
    data object Loading: HomeModelUiState
    data class Error(val throwable: Throwable): HomeModelUiState
    data class Success(val data: List<KPopIdolEntity>) : HomeModelUiState
}