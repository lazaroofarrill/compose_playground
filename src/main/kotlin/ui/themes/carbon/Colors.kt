package ui.themes.carbon

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class CarbonColors(
    val background: Color,
    val layer: Color,
    val field: Color,
    val border: Color,
    val text: Color,
    val link: Color,
    val icon: Color,
    val support: Color,
    val focus: Color,
    val skeleton: Color,
)

val LocalCarbonColors = staticCompositionLocalOf {
    CarbonColors(
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

object CarbonShades {
    val Black = Color(0xff000000)
    val White = Color(0xffffffff)
}