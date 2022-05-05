package ui.pages.carbonFiver


import com.copperleaf.ballast.EventHandler
import com.copperleaf.ballast.EventHandlerScope

class CarbonFiverEventHandler : EventHandler<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State> {
    override suspend fun EventHandlerScope<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State>.handleEvent(
        event: CarbonFiverContract.Events
    ) = when (event) {
        CarbonFiverContract.Events.ResetName -> TODO()
    }

}