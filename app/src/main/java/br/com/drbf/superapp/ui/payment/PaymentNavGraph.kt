package br.com.drbf.superapp.ui.payment

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import br.com.drbf.superapp.ui.MainRoutes
import br.com.drbf.superapp.ui.payment.paymenta.PaymentAScreen
import br.com.drbf.superapp.ui.payment.paymentb.PaymentBScreen
import kotlinx.serialization.Serializable

sealed interface PaymentDestination{
    @Serializable
    data object PaymentA: PaymentDestination
    @Serializable
    data class PaymentB(
        val name: String?,
        val age: Int
    ): PaymentDestination

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
    }
}




