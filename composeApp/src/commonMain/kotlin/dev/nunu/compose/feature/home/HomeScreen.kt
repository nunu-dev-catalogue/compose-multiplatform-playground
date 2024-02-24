package dev.nunu.compose.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import dev.nunu.compose.feature.home.component.HomeTopAppBar

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        var isCompletedTaskVisible by remember { mutableStateOf(true) }

        Scaffold(
            modifier = Modifier.fillMaxSize()
                .background(MaterialTheme.colors.background),
            topBar = {
                HomeTopAppBar(
                    isCompletedTaskVisible = isCompletedTaskVisible,
                    onToggleCompletedTaskVisibility = {
                        isCompletedTaskVisible = !isCompletedTaskVisible
                    }
                )
            }
        ) { paddingValues ->
            LazyColumn(
                modifier = Modifier.padding(
                    top = paddingValues.calculateTopPadding(),
                    bottom = paddingValues.calculateBottomPadding(),
                    start = 16.dp,
                    end = 16.dp
                )
            ) {
                item(key = "todo title") {
                    Text(text = "하는 중")
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}

