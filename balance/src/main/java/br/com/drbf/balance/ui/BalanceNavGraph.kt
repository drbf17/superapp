package br.com.drbf.balance.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import br.com.drbf.balance.ui.balance.balancea.BalanceAScreen
import br.com.drbf.balance.ui.balance.balanceb.BalanceBScreen
import br.com.drbf.navigation.ui.routes.MainRoutes
import br.com.drbf.navigation.ui.routes.exposed.balance.BalanceExposedDestinations

fun NavGraphBuilder.balanceNavGraph(navController: NavHostController) {
    navigation<MainRoutes.BalanceRoute>(
        startDestination = BalanceExposedDestinations.BalanceA::class,
    ) {

        composable<BalanceExposedDestinations.BalanceA>  {
            val args = it.toRoute<BalanceExposedDestinations.BalanceA>()
            BalanceAScreen(args = args)
        }
        composable<BalanceExposedDestinations.BalanceB>  {
            val args = it.toRoute<BalanceExposedDestinations.BalanceB>()
            BalanceBScreen(args = args)
        }
    }
}




