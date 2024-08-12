package br.com.drbf.navigation.ui.routes.exposed.balance

import br.com.drbf.navigation.domain.Person
import kotlinx.serialization.Serializable

sealed interface BalanceExposedDestinations {
    @Serializable
    data class BalanceA(val person: Person) : BalanceExposedDestinations

    @Serializable
    data class BalanceB(val name: String) : BalanceExposedDestinations

}