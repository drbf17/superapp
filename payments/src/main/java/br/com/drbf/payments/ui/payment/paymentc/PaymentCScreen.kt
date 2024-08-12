package br.com.drbf.payments.ui.payment.paymentb

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.drbf.design.ui.theme.SuperappTheme
import br.com.drbf.navigation.ui.routes.exposed.balance.BalanceExposedDestinations

@Composable
fun PaymentCScreen(name: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Payment C $name",  modifier = Modifier
            .drawWithCache {
                val brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF9E82F0),
                        Color(0xFF42A5F5)
                    )
                )
                onDrawBehind {
                    drawRoundRect(
                        brush,
                        cornerRadius = CornerRadius(10.dp.toPx())
                    )
                }
            }
            .padding(8.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BalanceAScreenPreview() {
    SuperappTheme {
        PaymentCScreen("teste")
    }
}
