package ui.pages.home

import com.copperleaf.ballast.InputHandler
import com.copperleaf.ballast.InputHandlerScope

class HomeInputHandler : InputHandler<HomeContract.Inputs, HomeContract.Events, HomeContract.State> {
    override suspend fun InputHandlerScope<HomeContract.Inputs, HomeContract.Events, HomeContract.State>.handleInput(
        input: HomeContract.Inputs
    ) = when (input) {
        is HomeContract.Inputs.ChangeName -> TODO()
    }
}