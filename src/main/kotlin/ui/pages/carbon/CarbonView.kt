package ui.pages.carbon

import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun CarbonView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val carbonViewModel = remember(applicationCoroutineScope) {
        CarbonViewModel(applicationCoroutineScope)
    }
    val carbonState: CarbonContract.State by carbonViewModel.observeStates().collectAsState()

    Text(carbonState.name)
}