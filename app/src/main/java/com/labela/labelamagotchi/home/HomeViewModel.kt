package com.labela.labelamagotchi.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(HomeViewModelState())
    val state: StateFlow<HomeViewModelState>
        get() = _state

    init {
        animateIdle()
        animateMovement()
    }

    private fun animateIdle() {
        viewModelScope.launch {
            _state.update { it.copy(isIdle = !state.value.isIdle) }
            delay(1000L)
            animateIdle()
        }
    }

    private fun animateMovement() {
        viewModelScope.launch {
            val newDirection = when (state.value.selectedColumn) {
                0 -> true
                state.value.maxColumns -> false
                else -> state.value.direction
            }

            val newSelectedColumn = if (newDirection) state.value.selectedColumn + 1
            else state.value.selectedColumn - 1

            _state.update { it.copy(selectedColumn = newSelectedColumn, direction = newDirection) }

            delay(1000L)
            animateMovement()
        }
    }

    data class HomeViewModelState(
        val direction: Boolean = true,
        val maxColumns: Int = 5,
        val selectedColumn: Int = 0,

        val isIdle: Boolean = false,
    )
}