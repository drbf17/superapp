package br.com.drbf.navigation.ui.routes.exposed.app

import kotlinx.serialization.Serializable

interface AppExposedDestination {
    @Serializable
    data class HomeC(val name: String): AppExposedDestination
}