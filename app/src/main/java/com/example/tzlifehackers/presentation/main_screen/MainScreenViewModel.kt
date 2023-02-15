package com.example.tzlifehackers.presentation.main_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tzlifehackers.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainScreenViewModel @Inject
constructor(
    val repository: Repository
) : ViewModel() {

    var state by mutableStateOf(MainScreenState())

    init{
        onTriggerEvent(event = MainScreenEvent.GetAllCompanies)
    }

    fun onTriggerEvent(event: MainScreenEvent){
        when(event){
            is MainScreenEvent.GetAllCompanies -> {
                getAllCompanies()
            }
        }
    }

    private fun getAllCompanies() {
        viewModelScope.launch {
            val result = repository.getCompanies()
            state = state.copy(companies = result)
        }
    }

}