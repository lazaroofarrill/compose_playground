package ui.pages.carbon

object CarbonContract {
    data class State(
        val name: String = ""
    )

    sealed class Inputs {
        data class ChangeName(val newName: String) : Inputs()
    }

    sealed class Events {
        object ResetName : Events()
    }
}