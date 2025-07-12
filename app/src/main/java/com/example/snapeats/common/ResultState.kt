package com.example.snapeats.common

sealed class ResultState<T> {
    data class Success<T>(val data: T) : ResultState<T>()
    data class Error<T>(val message: String) : ResultState<T>() //Nothing
    class Loading<T> : ResultState<T>()
}