package com.example.tzlifehackers.presentation.card_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.tzlifehackers.presentation.utils.BASE_URL
import com.example.tzlifehackers.presentation.utils.IMAGE_URL
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun CompanyImg(img: String) {
    Column(
        modifier = Modifier.padding(top = 20.dp)
            .fillMaxWidth(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CoilImage(
            imageModel = IMAGE_URL + img, modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .size(300.dp))
    }
}