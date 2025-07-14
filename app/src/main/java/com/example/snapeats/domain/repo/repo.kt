package com.example.snapeats.domain.repo

import com.example.snapeats.common.ResultState
import com.example.snapeats.data.models.UserData
import kotlinx.coroutines.flow.Flow

interface repo {
    fun loginwithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
    fun registerwithEmailAndPassword(userData: UserData): Flow<ResultState<String>>
}


