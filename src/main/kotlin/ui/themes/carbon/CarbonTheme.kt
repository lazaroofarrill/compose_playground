package ui.themes.carbon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp


@Composable
fun CarbonTheme(content: @Composable () -> Unit) {
    val carbonTypography = CarbonTypography(
        body = TextStyle(fontSize = 16.sp),
        title = TextStyle(fontSize = 56.sp),
        subTitle = TextStyle(fontSize = 32.sp),
        caption = TextStyle(fontSize = 12.sp)
    )

    val gray10Colors = CarbonColors(
        background = Color.Unspecified,
        layer = Color.Unspecified,
        field = Color.Unspecified,
        border = Color.Unspecified,
        text = Color.Unspecified,
        link = Color.Unspecified,
        icon = Color.Unspecified,
        support = Color.Unspecified,
        focus = Color.Unspecified,
        skeleton = Color.Unspecified,
    )
}