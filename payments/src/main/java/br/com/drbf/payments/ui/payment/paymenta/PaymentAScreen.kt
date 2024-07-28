package br.com.drbf.payments.ui.payment.paymenta

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.drbf.navigation.ui.routes.exposed.app.AppExposedDestination
import br.com.drbf.navigation.ui.routes.exposed.balance.BalanceExposedDestinations
import br.com.drbf.payments.ui.PaymentDestination

@Composable
fun PaymentAScreen(navigate: (Any) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navigate(PaymentDestination.PaymentB("John", 25))
        }) {
            Text(text = "Go to Payment B")
        }
        Button(onClick = {
            navigate(AppExposedDestination.HomeC("John"))
        }) {
            Text(text = "Go to Home C")
        }
        Button(onClick = {
            navigate(BalanceExposedDestinations.BalanceA("John"))
        }) {
            Text(text = "Go to Balance A")
        }
        Button(onClick = {
            navigate(BalanceExposedDestinations.BalanceB("John"))
        }) {
            Text(text = "Go to Balance B")
        }
    }
}