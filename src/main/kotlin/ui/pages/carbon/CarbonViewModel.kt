package ui.pages.carbon

import com.copperleaf.ballast.BallastViewModelConfiguration
import com.copperleaf.ballast.core.BasicViewModel
import com.copperleaf.ballast.core.LoggingInterceptor
import com.copperleaf.ballast.forViewModel
import kotlinx.coroutines.CoroutineScope

class CarbonViewModel(applicationCoroutineScope: CoroutineScope) :
    BasicViewModel<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State>(
        coroutineScope = applicationCoroutineScope,
        config = BallastViewModelConfiguration.Builder()
            .apply {
                this.interceptors += LoggingInterceptor<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State>()
            }.forViewModel(initialState = CarbonContract.State(), inputHandler = CarbonInputHandler()),
        eventHandler = CarbonEventHandler()
    ) {
}