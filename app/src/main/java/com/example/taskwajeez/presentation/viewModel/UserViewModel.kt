package com.example.taskwajeez.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskwajeez.domain.usecase.AddUserUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class UserViewModel(
   private val addUserUseCase: AddUserUseCase
    ) : ViewModel() {


    fun addUser(name: String, picture: String) {
        viewModelScope.launch {
            addUserUseCase.execute(name,picture).collect {
                response -> 
            }
        }
    }

}