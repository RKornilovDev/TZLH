package com.example.tzlifehackers.domain.model

data class InfoDetails(
    val id: Int,
    val name: String,
    val img: String,
    val description: String,
    val lat: Double,
    val lon: Double,
    val www: String,
    val phone: String
)
