package com.example.taskwajeez.domain.usecase

import com.example.taskwajeez.data.model.User
import com.example.taskwajeez.data.util.Resource
import com.example.taskwajeez.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow


class GetUsersUseCase(private val userRepository: UserRepository) {

    fun execute(): Resource<Flow<List<User>>> = userRepository.getUser()

}