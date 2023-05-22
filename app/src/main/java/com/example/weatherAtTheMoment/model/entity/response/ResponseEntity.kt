package com.example.weatherAtTheMoment.model.entity.response

sealed class ResponseEntity {
    data class Success<out T>(val data: T) : ResponseEntity()
    data class Error(val error: String) : ResponseEntity()
}