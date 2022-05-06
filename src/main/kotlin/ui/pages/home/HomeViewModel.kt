package ui.pages.home

import com.copperleaf.ballast.BallastViewModelConfiguration
import com.copperleaf.ballast.core.BasicViewModel
import com.copperleaf.ballast.core.LoggingInterceptor
import com.copperleaf.ballast.forViewModel
import kotlinx.coroutines.CoroutineScope

class HomeViewModel(applicationCoroutineScope: CoroutineScope) :
    BasicViewModel<HomeContract.Inputs, HomeContract.Events, HomeContract.State>(
        coroutineScope = applicationCoroutineScope,
        config = BallastViewModelConfiguration.Builder()
            .apply {
                this.interceptors += LoggingInterceptor<HomeContract.Inputs, HomeContract.Events, HomeContract.State>()
            }.forViewModel(initialState = HomeContract.State(), inputHandler = HomeInputHandler()),
        eventHandler = HomeEventHandler()
    ) {
}