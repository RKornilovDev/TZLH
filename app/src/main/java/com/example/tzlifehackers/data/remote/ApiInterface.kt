package com.example.tzlifehackers.data.remote

import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.domain.model.InfoDetails
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/test_task/test.php")
    suspend fun getCompanies(): List<CardInfo>

    @GET("/test_task/test.php")
    suspend fun getCompanyInfo(
        @Query("id") id: Int,
    ): List<InfoDetails>



}