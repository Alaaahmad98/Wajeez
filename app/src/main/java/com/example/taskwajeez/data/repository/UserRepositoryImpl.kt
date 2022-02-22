package com.example.taskwajeez.data.repository

import com.example.taskwajeez.data.model.User
import com.example.taskwajeez.data.util.Resource
import com.example.taskwajeez.domain.repository.UserRepository
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.Query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(
    private val userRef: CollectionReference,
    private val userQuery: Query,
) : UserRepository {

    override suspend fun addUser(username: String, userProfile: String?): Flow<Resource<Void?>> = flow {
            try {
                val userId = userRef.document().id
                val user = User(
                    userName = "alaa",
                    userPicture = ""
                )
                val addition = userRef.document(userId).set(user)
            } catch (e: Exception) {
                emit(Resource.Error(e.message ?: e.toString()))
            }
        }


    override fun getUser(): Resource<Flow<List<User>>> {
        TODO("Not yet implemented")
    }

    override fun getSearchedUser(searchQuery: String): Resource<Flow<List<User>>> {
        TODO("Not yet implemented")
    }

    override fun getFilterUser(): Resource<Flow<List<User>>> {
        TODO("Not yet implemented")
    }
}