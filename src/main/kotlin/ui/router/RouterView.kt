package ui.router


import androidx.compose.material.Text
import androidx.compose.runtime.*
import ui.pages.home.HomeView

val GlobalRouter = compositionLocalOf<RouterViewModel> { error("Router not provided") }


@Composable
fun RouterView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val routerViewModel = remember(applicationCoroutineScope) {
        RouterViewModel(applicationCoroutineScope)
    }
    val routerState: RouterContract.State by routerViewModel.observeStates().collectAsState()

    CompositionLocalProvider(GlobalRouter provides routerViewModel) {
        when (routerState.currentRoute) {
            RouterPage.Home -> HomeView()
        }
    }
}