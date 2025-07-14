package com.example.snapeats.domain.useCases

import com.example.snapeats.common.ResultState
import com.example.snapeats.data.models.UserData
import com.example.snapeats.domain.repo.repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(
    val repo : repo
) {
    fun loginUser(userData: UserData) : Flow<ResultState<String>> {
        return repo.loginwithEmailAndPassword(userData = userData)
    }
}