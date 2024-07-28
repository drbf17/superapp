package br.com.drbf.superapp.ui.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import br.com.drbf.navigation.ui.routes.MainRoutes
import br.com.drbf.navigation.ui.routes.exposed.app.AppExposedDestination
import br.com.drbf.superapp.ui.home.homea.HomeAScreen
import br.com.drbf.superapp.ui.home.homeb.HomeBScreen
import br.com.drbf.superapp.ui.home.homec.HomeCScreen
import kotlinx.serialization.Serializable

sealed interface HomeDestination{
    @Serializable
    data object HomeA: HomeDestination
    @Serializable
    data class HomeB(
        val name: String?,
        val age: Int
    ): HomeDestination

}

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    navigation<MainRoutes.HomeRoute>(
        startDestination = HomeDestination.HomeA
    ) {
        composable<HomeDestination.HomeA> {
            HomeAScreen { destination ->
                navController.navigate(destination)
            }
        }
        composable<HomeDestination.HomeB> {
            val args = it.toRoute<HomeDestination.HomeB>()
            HomeBScreen(args)
        }
        composable<AppExposedDestination.HomeC> {
            val args = it.toRoute<AppExposedDestination.HomeC>()
            HomeCScreen(args)
        }
    }
}




