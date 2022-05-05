package ui.pages.carbon

import com.copperleaf.ballast.InputHandler
import com.copperleaf.ballast.InputHandlerScope

class CarbonInputHandler : InputHandler<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State> {
    override suspend fun InputHandlerScope<CarbonContract.Inputs, CarbonContract.Events, CarbonContract.State>.handleInput(
        input: CarbonContract.Inputs
    ) = when (input) {
        is CarbonContract.Inputs.ChangeName -> TODO()
    }
}