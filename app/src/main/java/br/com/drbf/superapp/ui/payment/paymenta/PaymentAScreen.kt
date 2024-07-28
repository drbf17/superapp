package br.com.drbf.superapp.ui.payment.paymenta

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.drbf.superapp.ui.home.HomeDestination
import br.com.drbf.superapp.ui.payment.PaymentDestination

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
    }
}