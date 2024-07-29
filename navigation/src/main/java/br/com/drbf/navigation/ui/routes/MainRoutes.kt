package br.com.drbf.navigation.ui.routes

import kotlinx.serialization.Serializable

sealed interface MainRoutes {
    @Serializable
    data object HomeRoute : MainRoutes

    @Serializable
    data object PaymentRoute : MainRoutes

    @Serializable
    data object BalanceRoute : MainRoutes
}