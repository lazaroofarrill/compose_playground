package ui.pages.home


import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun HomeView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val homeViewModel = remember(applicationCoroutineScope) {
        HomeViewModel(applicationCoroutineScope)
    }
    val homeState: HomeContract.State by homeViewModel.observeStates().collectAsState()

    Text(homeState.name)
}