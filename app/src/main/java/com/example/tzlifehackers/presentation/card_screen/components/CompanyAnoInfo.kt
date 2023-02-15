package com.example.tzlifehackers.presentation.card_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tzlifehackers.presentation.card_screen.CardScreenViewModel

@Composable
fun CompanyAnoInfo(phone: String, web: String) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$phone", style = MaterialTheme.typography.body1, fontSize = 20.sp)
        Text(text = "$web", style = MaterialTheme.typography.body1, fontSize = 20.sp)

    }
}