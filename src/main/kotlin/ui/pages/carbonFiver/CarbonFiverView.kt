package ui.pages.carbonFiver


import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun CarbonFiverView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val carbonFiverViewModel = remember(applicationCoroutineScope) {
        CarbonFiverViewModel(applicationCoroutineScope)
    }
    val carbonFiverState: CarbonFiverContract.State by carbonFiverViewModel.observeStates().collectAsState()

    Text(carbonFiverState.name)
}