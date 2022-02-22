package com.example.taskwajeez.domain.repository

import com.example.taskwajeez.data.model.User
import com.example.taskwajeez.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    suspend fun addUser(username: String, userProfile: String?):Flow<Resource<Void?>>

    fun getUser(): Resource<Flow<List<User>>>

    fun getSearchedUser(searchQuery: String): Resource<Flow<List<User>>>

    fun getFilterUser(): Resource<Flow<List<User>>>

}