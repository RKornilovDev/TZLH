package com.example.tzlifehackers.presentation.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.presentation.main_screen.components.CompanyItem
import com.example.tzlifehackers.presentation.utils.Screen


@Composable
fun MainScreen(viewModel: MainScreenViewModel = hiltViewModel(), navController: NavController) {
    val state = viewModel.state
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(
            colors = listOf(
                Color.Red, Color.Yellow
            )))
    ) {
        LazyColumn(modifier = Modifier.padding(20.dp),verticalArrangement = Arrangement.spacedBy(15.dp),
            content = {
                items(state.companies,
                    key = { company ->
                        company.id
                    }) { company ->
                    CompanyItem(cardInfo = company, onClick = {
                        navController.navigate(Screen.CardScreen.route + "/$it")
                    })
                }
            }
        )
    }
}

