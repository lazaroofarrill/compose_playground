package ui.themes.carbon

import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun CarbonTheme(content: @Composable () -> Unit) {
    val carbonTypography = CarbonTypography(
        body = TextStyle(fontSize = 16.sp, fontFamily = IBMPLexSansFontFamily),
        title = TextStyle(fontSize = 56.sp, fontFamily = IBMPLexSansFontFamily),
        subTitle = TextStyle(
            fontSize = 32.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontFamily = IBMPLexSansFontFamily
        ),
        caption = TextStyle(fontSize = 12.sp, fontFamily = IBMPLexSansFontFamily, fontWeight = FontWeight.Medium)
    )

    val gray10Colors = CarbonColors(
        background = Gray10,
        layer = Blue60,
        field = Gray90,
        border = White,
        text = Gray100,
        link = Blue70,
        icon = Gray100,
        support = Blue70,
        focus = Blue80,
        skeleton = White,
    )

    CompositionLocalProvider(
        LocalCarbonColors provides gray10Colors,
        LocalCarbonTypography provides carbonTypography,
        LocalTextStyle provides LocalTextStyle.current.copy(fontFamily = IBMPLexSansFontFamily),
        content = content
    )
}

object CarbonTheme {
    val colors: CarbonColors
        @Composable
        get() = LocalCarbonColors.current
    val typography: CarbonTypography
        @Composable
        get() = LocalCarbonTypography.current
}