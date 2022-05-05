package ui.pages.carbon

import com.copperleaf.ballast.EventHandler
import com.copperleaf.ballast.EventHandlerScope

class CarbonEventHandler : EventHandler<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State> {
    override suspend fun EventHandlerScope<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State>.handleEvent(
        event: CarbonContract.Events
    ) = when (event) {
        CarbonContract.Events.ResetName -> TODO()
    }

}