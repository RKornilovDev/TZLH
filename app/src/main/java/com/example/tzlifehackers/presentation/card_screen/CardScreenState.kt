package com.example.tzlifehackers.presentation.card_screen

import com.example.tzlifehackers.domain.model.InfoDetails

data class CardScreenState(
    val infoDetails: InfoDetails = InfoDetails(0, "", "", "", 0.0, 0.0, "", ""),
)