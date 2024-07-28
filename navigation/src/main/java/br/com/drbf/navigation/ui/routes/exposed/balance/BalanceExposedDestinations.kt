package br.com.drbf.navigation.ui.routes.exposed.balance

import kotlinx.serialization.Serializable

sealed interface BalanceExposedDestinations {
    @Serializable
    data class BalanceA(val name: String) : BalanceExposedDestinations

    @Serializable
    data class BalanceB(val name: String) : BalanceExposedDestinations

}