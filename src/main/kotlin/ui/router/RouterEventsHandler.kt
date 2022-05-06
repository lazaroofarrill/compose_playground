package ui.router


import com.copperleaf.ballast.EventHandler
import com.copperleaf.ballast.EventHandlerScope

class RouterEventHandler : EventHandler<RouterContract.Inputs, RouterContract.Events, RouterContract.State> {
    override suspend fun EventHandlerScope<RouterContract.Inputs, RouterContract.Events, RouterContract.State>.handleEvent(
        event: RouterContract.Events
    ) {
    }

}