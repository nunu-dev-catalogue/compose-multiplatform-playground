package dev.nunu.compose.feature.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import composemultiplatformdemo.composeapp.generated.resources.Res
import composemultiplatformdemo.composeapp.generated.resources.ic_title_home
import composemultiplatformdemo.composeapp.generated.resources.ic_title_todo
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.vectorResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeTopAppBar(
    isCompletedTaskVisible: Boolean,
    onToggleCompletedTaskVisibility: () -> Unit
) {
    TopAppBar(
        title = {
            Image(
                imageVector = vectorResource(Res.drawable.ic_title_todo),
                contentDescription = "Home Title: Star"
            )
        },
        actions = {
            CompletedTaskVisibilityToggleButton(
                isVisible = isCompletedTaskVisible,
                onToggle = onToggleCompletedTaskVisibility
            )
            Spacer(modifier = Modifier.width(12.dp))
        },
        backgroundColor = MaterialTheme.colors.surface
    )
}
