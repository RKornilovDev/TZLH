package com.example.tzlifehackers.domain.repository

import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.domain.model.InfoDetails

interface Repository {
    suspend fun getCompanies():List<CardInfo>
    suspend fun getCompanyInfo(id: Int):List<InfoDetails>
}