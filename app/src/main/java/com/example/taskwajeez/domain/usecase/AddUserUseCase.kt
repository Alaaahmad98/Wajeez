package com.example.taskwajeez.domain.usecase

import com.example.taskwajeez.domain.repository.UserRepository

class AddUserUseCase(private val userRepository: UserRepository) {

    suspend fun execute(username: String, userProfile: String?) =
        userRepository.addUser(username, userProfile)

}