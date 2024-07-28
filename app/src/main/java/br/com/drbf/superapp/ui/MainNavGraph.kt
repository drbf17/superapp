package br.com.drbf.superapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import br.com.drbf.superapp.ui.home.HomeDestination

import br.com.drbf.superapp.ui.home.homeNavGraph
import br.com.drbf.superapp.ui.payment.paymentNavGraph
import kotlinx.serialization.Serializable

sealed interface MainRoutes {
    @Serializable
    data object HomeRoute : MainRoutes

    @Serializable
    data object PaymentRoute : MainRoutes

    @Serializable
    data object RegisterRoute : MainRoutes
}

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = MainRoutes.HomeRoute
    ) {
        homeNavGraph(navController)
        paymentNavGraph(navController)
    }

}

