package com.example.tzlifehackers.presentation.card_screen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tzlifehackers.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

private const val TAG = "CardScreenViewModel"
@HiltViewModel
class CardScreenViewModel @Inject
constructor(
    val repository: Repository,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    var state by mutableStateOf(CardScreenState())

    init {
        onTriggerEvent(event = CardScreenEvent.GetInfo)
    }

    fun onTriggerEvent(event: CardScreenEvent) {
        when (event) {
            is CardScreenEvent.GetInfo -> {
                getInfo()
            }
        }
    }

    private fun getInfo() {
        savedStateHandle.get<Int>("cardId")?.let { id ->
                viewModelScope.launch {
                    val result = repository.getCompanyInfo(id)
                    state = state.copy(infoDetails = result[0])
                    Log.d(TAG, "getInfo: $state")
                }

        }
    }
}