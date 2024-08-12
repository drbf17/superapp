package br.com.drbf.navigation.ui.routes.exposed.balance

import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import br.com.drbf.navigation.domain.Person
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object PersonNavType : NavType<Person>(
    isNullableAllowed = true,
) {
    override fun get(bundle: Bundle, key: String): Person? {
        return Json.decodeFromString(bundle.getString(key) ?: return null)
    }

    override fun parseValue(value: String): Person {
        return Json.decodeFromString(Uri.decode(value))
    }

    override fun serializeAsValue(value: Person): String {
        return Uri.encode(Json.encodeToString(value))
    }

    override fun put(bundle: Bundle, key: String, value: Person) {
        bundle.putString(key, Json.encodeToString(value))
    }
}

