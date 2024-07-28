package br.com.drbf.superapp.ui.payment.paymentb

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.drbf.superapp.ui.home.HomeDestination
import br.com.drbf.superapp.ui.payment.PaymentDestination

@Composable
fun PaymentBScreen(args: PaymentDestination.PaymentB) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Payment B ${args.name}, ${args.age} years old")
    }
}