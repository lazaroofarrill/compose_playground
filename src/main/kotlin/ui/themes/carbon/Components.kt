package ui.themes.carbon

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.ui.focus.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerMoveFilter
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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
    var isFocused by remember { mutableStateOf(false) }

    val currentColor = if (isHovered) hoverColor else color
    val focusRequester = remember { FocusRequester() }

    Row(
        modifier = modifier
            .pointerMoveFilter(onEnter = {
                isHovered = true
                false
            }, onExit = {
                isHovered = false
                false
            })
            .clickable {
                focusRequester.requestFocus()
//                onClick()
            }
            .background(if (isHovered) hoverColor else color)
            .padding(2.dp)
            .border(BorderStroke(1.dp, color = if (isFocused) White else currentColor))
            .focusRequester(focusRequester)
            .onFocusChanged {
                isFocused = it.isFocused
            }
            .focusable()
            .padding(vertical = 1.mu, horizontal = 2.mu),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(1.mu)
    ) {
        CompositionLocalProvider(
            LocalTextStyle provides LocalTextStyle.current.copy(
                color = contentColor,
                fontWeight = FontWeight.Light
            )
        ) {
            content.invoke()
            icon?.let { Icon(imageVector = it, contentDescription = icon.name, tint = LocalTextStyle.current.color) }
        }
    }
}

@Composable
fun COutlinedButton(modifier: Modifier = Modifier, content: @Composable () -> Unit) {

}