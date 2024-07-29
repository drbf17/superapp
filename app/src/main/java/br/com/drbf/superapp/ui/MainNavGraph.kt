package br.com.drbf.superapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import br.com.drbf.balance.ui.balanceNavGraph
import br.com.drbf.navigation.ui.routes.MainRoutes
import br.com.drbf.payments.ui.paymentNavGraph
import br.com.drbf.superapp.ui.home.homeNavGraph


@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = MainRoutes.HomeRoute
    ) {
        homeNavGraph(navController)
        paymentNavGraph(navController)
        balanceNavGraph(navController)
    }

}

