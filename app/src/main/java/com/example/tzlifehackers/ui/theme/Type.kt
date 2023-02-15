package com.example.tzlifehackers.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tzlifehackers.R

val MarkPro = FontFamily(
    listOf(
        Font(R.font.mark_pro_bold, FontWeight.Bold),
        Font(R.font.mark_pro_heavy_bold, FontWeight.ExtraBold),
        Font(R.font.mark_pro_medium_regular, FontWeight.Medium),
        Font(R.font.mark_pro_regular, FontWeight.Normal)
    )
)


val Typography = Typography(
    h1 = TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.W800,
        fontSize = 30.sp,
        letterSpacing = ((-0.3333333333).sp),
        lineHeight = 33.sp
    ),
    body1 = TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp
    ),
    h2 = TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.Medium,
        fontSize = 60.sp
    ),
    body2 = TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.Normal,
        fontSize = 60.sp
    )


)
