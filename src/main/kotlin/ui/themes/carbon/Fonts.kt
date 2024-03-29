package ui.themes.carbon

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp
import javax.print.attribute.TextSyntax

val IBMPLexSansFontFamily = FontFamily(
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Regular.ttf"),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Italic.ttf", style = FontStyle.Italic),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Bold.ttf", weight = FontWeight.Bold),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-BoldItalic.ttf",
        weight = FontWeight.Bold,
        style = FontStyle.Italic
    ),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Light.ttf", weight = FontWeight.Light),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-LightItalic.ttf",
        weight = FontWeight.Light,
        style = FontStyle.Italic
    ),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-ExtraLight.ttf", weight = FontWeight.ExtraLight),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-ExtraLightItalic.ttf",
        weight = FontWeight.ExtraLight,
        style = FontStyle.Italic
    ),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Medium.ttf", weight = FontWeight.Medium),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-MediumItalic.ttf",
        weight = FontWeight.Medium,
        style = FontStyle.Italic
    ),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-SemiBold.ttf", weight = FontWeight.SemiBold),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-SemiBoldItalic.ttf",
        weight = FontWeight.SemiBold,
        style = FontStyle.Italic
    ),
    Font(resource = "fonts/IBM_Plex_Sans/IBMPlexSans-Thin.ttf", weight = FontWeight.Thin),
    Font(
        resource = "fonts/IBM_Plex_Sans/IBMPlexSans-ThinItalic.ttf",
        weight = FontWeight.Thin,
        style = FontStyle.Italic
    ),
)

@Immutable
data class CarbonTypography(
    val body: TextStyle,
    val title: TextStyle,
    val subTitle: TextStyle,
    val caption: TextStyle
)


val LocalCarbonTypography = staticCompositionLocalOf {
    CarbonTypography(
        body = TextStyle.Default,
        title = TextStyle.Default,
        subTitle = TextStyle.Default,
        caption = TextStyle.Default
    )
}