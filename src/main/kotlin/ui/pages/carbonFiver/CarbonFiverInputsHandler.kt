package ui.pages.carbonFiver

import com.copperleaf.ballast.InputHandler
import com.copperleaf.ballast.InputHandlerScope

class CarbonFiverInputHandler : InputHandler<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State> {
    override suspend fun InputHandlerScope<CarbonFiverContract.Inputs, CarbonFiverContract.Events, CarbonFiverContract.State>.handleInput(
        input: CarbonFiverContract.Inputs
    ) = when (input) {
        is CarbonFiverContract.Inputs.ChangeName -> TODO()
    }
}