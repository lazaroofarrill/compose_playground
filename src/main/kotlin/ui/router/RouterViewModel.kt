package ui.router

import com.copperleaf.ballast.BallastViewModelConfiguration
import com.copperleaf.ballast.core.BasicViewModel
import com.copperleaf.ballast.core.LoggingInterceptor
import com.copperleaf.ballast.forViewModel
import kotlinx.coroutines.CoroutineScope

class RouterViewModel(applicationCoroutineScope: CoroutineScope) :
    BasicViewModel<RouterContract.Inputs, RouterContract.Events, RouterContract.State>(
        coroutineScope = applicationCoroutineScope,
        config = BallastViewModelConfiguration.Builder()
            .apply {
                this.interceptors += LoggingInterceptor<RouterContract.Inputs, RouterContract.Events, RouterContract.State>()
            }.forViewModel(initialState = RouterContract.State(), inputHandler = RouterInputHandler()),
        eventHandler = RouterEventHandler()
    ) {
}