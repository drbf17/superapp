package br.com.drbf.payments.ui

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import androidx.navigation.toRoute
import br.com.drbf.navigation.ui.routes.MainRoutes
import br.com.drbf.payments.ui.payment.paymenta.PaymentAScreen
import br.com.drbf.payments.ui.payment.paymentb.PaymentBScreen
import br.com.drbf.payments.ui.payment.paymentb.PaymentCScreen
import kotlinx.serialization.Serializable

sealed interface PaymentDestination {
    @Serializable
    data object PaymentA : PaymentDestination

    @Serializable
    data class PaymentB(
        val name: String?,
        val age: Int
    ) : PaymentDestination

    @Serializable
    data object PaymentC : PaymentDestination

}

fun NavGraphBuilder.paymentNavGraph(navController: NavHostController) {
    navigation<MainRoutes.PaymentRoute>(
        startDestination = PaymentDestination.PaymentA
    ) {
        composable<PaymentDestination.PaymentA> {
            PaymentAScreen { destination ->
                navController.navigate(destination)
            }
        }
        composable<PaymentDestination.PaymentB> {
            val args = it.toRoute<PaymentDestination.PaymentB>()
            PaymentBScreen(args)
        }
        composable<PaymentDestination.PaymentC> (
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "app://www.drbf.com.br/payment/{name}"
                }
            )
        ){ backStackEntry ->
            val argument = backStackEntry.arguments?.getString("name")
            PaymentCScreen(argument)
        }
    }
}




