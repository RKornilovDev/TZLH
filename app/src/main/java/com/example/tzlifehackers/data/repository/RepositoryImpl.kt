package com.example.tzlifehackers.data.repository

import android.util.Log
import com.example.tzlifehackers.data.remote.ApiInterface
import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.domain.model.InfoDetails
import com.example.tzlifehackers.domain.repository.Repository
import javax.inject.Inject

private const val TAG = "RepositoryImpl"
class RepositoryImpl @Inject constructor(
    val apiInterface: ApiInterface
)
: Repository{
    override suspend fun getCompanies(): List<CardInfo> {
        return apiInterface.getCompanies()
    }

    override suspend fun getCompanyInfo(id: Int): List<InfoDetails> {
       return apiInterface.getCompanyInfo(id = id)
    }
}

// viewModel (repository)  -> repository.getCompanies()  || repositroy.getCompanyInfo(id = 1)