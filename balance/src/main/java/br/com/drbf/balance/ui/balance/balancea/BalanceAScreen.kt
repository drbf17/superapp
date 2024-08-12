package br.com.drbf.balance.ui.balance.balancea

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.drbf.design.ui.theme.SuperappTheme
import br.com.drbf.navigation.domain.Person
import br.com.drbf.navigation.ui.routes.exposed.balance.BalanceExposedDestinations


@Composable
fun BalanceAScreen(args: BalanceExposedDestinations.BalanceA) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Balance B ${args.person}")
    }

}


@Preview(showBackground = true)
@Composable
fun BalanceAScreenPreview() {
    SuperappTheme {
        BalanceAScreen(
            BalanceExposedDestinations.BalanceA(
                person = Person(name = "Person", id = 10, age = 10)
            )
        )
    }
}



