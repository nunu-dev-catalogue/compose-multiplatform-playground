package dev.nunu.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import dev.nunu.compose.feature.home.HomeScreen

@Composable
fun App() {
    MaterialTheme {
        Navigator(screen = HomeScreen)
    }
}
