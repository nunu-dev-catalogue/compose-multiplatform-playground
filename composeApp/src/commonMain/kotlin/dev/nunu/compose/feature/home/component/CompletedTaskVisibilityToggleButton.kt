package dev.nunu.compose.feature.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.nunu.compose.designsystem.TodoTheme

@Composable
fun CompletedTaskVisibilityToggleButton(
    isVisible: Boolean,
    onToggle: () -> Unit
) {
    Text(
        text = if (isVisible) {
            "완료 숨기기"
        } else {
            "완료 보기"
        },
        style = TodoTheme.typography.medium2,
        color = TodoTheme.colors.onSurfaceContainerHigh,
        modifier = Modifier
            .background(
                color = if (isVisible) {
                    TodoTheme.colors.surfaceContainerHigh
                } else {
                    TodoTheme.colors.primary
                },
                shape = RoundedCornerShape(4.dp)
            )
            .clickable(onClick = onToggle)
            .width(77.dp)
            .padding(vertical = 8.dp),
        textAlign = TextAlign.Center
    )
}
