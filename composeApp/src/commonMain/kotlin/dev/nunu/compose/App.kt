package dev.nunu.compose

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import dev.nunu.compose.designsystem.TodoTheme
import dev.nunu.compose.feature.home.HomeScreen

@Composable
fun App() {
    TodoTheme {
        Navigator(screen = HomeScreen)
    }
}
