package ui.pages.home


import androidx.compose.foundation.layout.Column
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.*
import ui.themes.carbon.CButton
import ui.themes.carbon.IBMPLexSansFontFamily

@Composable
fun HomeView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val homeViewModel = remember(applicationCoroutineScope) {
        HomeViewModel(applicationCoroutineScope)
    }
    val homeState: HomeContract.State by homeViewModel.observeStates().collectAsState()

    Column {
        for (i in 1..3) {
            CButton(onClick = {}, icon = Icons.Outlined.Home) {
                Text("How you doing", fontFamily = IBMPLexSansFontFamily)
            }
        }
    }
}