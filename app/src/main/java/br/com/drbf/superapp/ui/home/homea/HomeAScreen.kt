package br.com.drbf.superapp.ui.home.homea

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.drbf.navigation.ui.routes.MainRoutes
import br.com.drbf.superapp.ui.home.HomeDestination

@Composable
fun HomeAScreen(navigate: (Any) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navigate(HomeDestination.HomeB("John", 25))
        }) {
            Text(text = "Go to Home B")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navigate(MainRoutes.PaymentRoute)
        }) {
            Text(text = "Go to Payment")
        }
    }
}