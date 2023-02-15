package com.example.tzlifehackers.presentation.card_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tzlifehackers.presentation.card_screen.CardScreenViewModel

@Composable
fun CompanyInfo(info: String) {
    Column(
        modifier = Modifier
            .padding(top = 15.dp)
            .fillMaxWidth()
    ) {
        Text(text = "$info", style = MaterialTheme.typography.body2, fontSize = 20.sp, textAlign = TextAlign.Center )
    }
}