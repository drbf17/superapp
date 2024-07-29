package br.com.drbf.superapp.ui.home.homec

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import br.com.drbf.navigation.ui.routes.exposed.app.AppExposedDestination

@Composable
fun HomeCScreen(args: AppExposedDestination.HomeC) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home C ${args.name}")
    }
}