package authorization

sealed class Routes(val route: String) {

    object Authorization : Routes("authorization")
    object MainScreen : Routes("main_screen")
}