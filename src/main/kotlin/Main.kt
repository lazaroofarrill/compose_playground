// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.pages.home.HomeView
import ui.router.RouterContract
import ui.router.RouterPage
import ui.router.RouterView
import ui.router.RouterViewModel

@Composable
@Preview
fun App(routerState: RouterContract.State, routerPostInput: (RouterContract.Inputs) -> Unit) {
    RouterView()
}


fun main() = application {
    val appCoroutineScope = rememberCoroutineScope()
    val routerViewModel = remember(appCoroutineScope) {
        RouterViewModel(appCoroutineScope)
    }
    val routerState: RouterContract.State by routerViewModel.observeStates().collectAsState()

    Window(onCloseRequest = ::exitApplication) {
        App(routerState) {
            routerViewModel.trySend(it)
        }
    }
}
