package ui.router


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import ui.pages.home.HomeView
import ui.themes.carbon.CarbonTheme

val GlobalRouter = compositionLocalOf<RouterViewModel> { error("Router not provided") }


@Composable
fun RouterView() {
    val applicationCoroutineScope = rememberCoroutineScope()
    val routerViewModel = remember(applicationCoroutineScope) {
        RouterViewModel(applicationCoroutineScope)
    }
    val routerState: RouterContract.State by routerViewModel.observeStates().collectAsState()

    CarbonTheme {
        CompositionLocalProvider(GlobalRouter provides routerViewModel) {
            Box(modifier = Modifier.fillMaxSize().background(CarbonTheme.colors.background)) {
                when (routerState.currentRoute) {
                    RouterPage.Home -> HomeView()
                }
            }
        }
    }
}