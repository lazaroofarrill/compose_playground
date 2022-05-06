package ui.router


object RouterContract {
    data class State(
        val currentRoute: RouterPage = RouterPage.Home
    )

    sealed class Inputs {
        data class ChangeRoute(val newPage: RouterPage) : Inputs()
    }

    sealed class Events {
    }
}