package com.example.tzlifehackers.presentation.main_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tzlifehackers.domain.model.CardInfo
import com.example.tzlifehackers.presentation.utils.IMAGE_URL
import com.example.tzlifehackers.ui.theme.MarkPro
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun CompanyItem(cardInfo: CardInfo, onClick:(id: Int) -> Unit) {
    Card(
        modifier = Modifier
            .clickable {
                onClick(cardInfo.id)
            }
            .height(50.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp,

        ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                imageModel = IMAGE_URL + cardInfo.img,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp)
            )
            Spacer(modifier = Modifier.padding(start = 20.dp))
            Text(text = "${cardInfo.name}", fontSize = 20.sp, style = MaterialTheme.typography.h1)
        }
    }
}
