package ui.pages.carbonFiver

import com.copperleaf.ballast.BallastViewModelConfiguration
import com.copperleaf.ballast.core.BasicViewModel
import com.copperleaf.ballast.core.LoggingInterceptor
import com.copperleaf.ballast.forViewModel
import kotlinx.coroutines.CoroutineScope

class CarbonFiverViewModel(applicationCoroutineScope: CoroutineScope) :
    BasicViewModel<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State>(
        coroutineScope = applicationCoroutineScope,
        config = BallastViewModelConfiguration.Builder()
            .apply {
                this.interceptors += LoggingInterceptor<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State>()
            }.forViewModel(initialState = CarbonFiverContract.State(), inputHandler = CarbonFiverInputHandler()),
        eventHandler = CarbonFiverEventHandler()
    ) {
}