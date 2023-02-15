package com.example.tzlifehackers.presentation.card_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.domain.repository.Repository
import com.example.tzlifehackers.presentation.card_screen.components.*
import com.example.tzlifehackers.ui.theme.BackGround
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

//TODO Row must be in CompanyName Composable

@Composable
fun CardScreen(navController: NavController, viewModel: CardScreenViewModel = hiltViewModel()) {
    val state = viewModel.state
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.White, BackGround
                    )
                )
            )
            .padding(all = 15.dp)

    ) {
        CompanyName(name = state.infoDetails.name)
        CompanyImg(img = state.infoDetails.img)
        CompanyInfo(info = state.infoDetails.description)
        CompanyAnoInfo(
            phone = state.infoDetails.phone,
            web = state.infoDetails.www
        )
    }
}