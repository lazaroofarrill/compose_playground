package ui.router

import com.copperleaf.ballast.InputHandler
import com.copperleaf.ballast.InputHandlerScope

class RouterInputHandler : InputHandler<RouterContract.Inputs, RouterContract.Events, RouterContract.State> {
    override suspend fun InputHandlerScope<RouterContract.Inputs, RouterContract.Events, RouterContract.State>.handleInput(
        input: RouterContract.Inputs
    ) = when (input) {
        is RouterContract.Inputs.ChangeRoute -> {
            updateState {
                it.copy(currentRoute = input.newPage)
            }
        }
    }
}