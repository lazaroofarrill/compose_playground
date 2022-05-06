package ui.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

inline val Int.mu: Dp get() = this.dp * 8