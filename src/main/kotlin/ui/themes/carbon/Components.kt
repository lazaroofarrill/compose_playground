package ui.themes.carbon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerMoveFilter
import androidx.compose.ui.modifier.modifierLocalProvider
import ui.utils.mu

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CButton(
    modifier: Modifier = Modifier,
    color: Color = CarbonTheme.colors.layer,
    hoverColor: Color = CarbonTheme.colors.focus,
    contentColor: Color = White,
    icon: ImageVector? = null,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {

    var isHovered by remember { mutableStateOf(false) }


    Row(
        modifier = modifier
            .pointerMoveFilter(onEnter = {
                isHovered = true
                false
            }, onExit = {
                isHovered = false
                false
            })
            .background(if (isHovered) hoverColor else color)
            .padding(vertical = 1.mu, horizontal = 2.mu),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(1.mu)
    ) {
        CompositionLocalProvider(LocalTextStyle provides LocalTextStyle.current.copy(color = contentColor)) {
            content.invoke()
            icon?.let { Icon(imageVector = it, contentDescription = icon.name, tint = LocalTextStyle.current.color) }
        }
    }
}