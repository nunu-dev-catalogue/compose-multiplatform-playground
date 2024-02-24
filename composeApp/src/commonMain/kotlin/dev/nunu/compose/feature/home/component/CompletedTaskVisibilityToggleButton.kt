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
        style = MaterialTheme.typography.body2,
        color = if (isVisible) {
            MaterialTheme.colors.onSurface
        } else {
            MaterialTheme.colors.onPrimary
        },
        modifier = Modifier
            .background(
                color = if (isVisible) {
                    MaterialTheme.colors.surface
                } else {
                    MaterialTheme.colors.primary
                },
                shape = RoundedCornerShape(4.dp)
            )
            .clickable(onClick = onToggle)
            .width(77.dp)
            .padding(vertical = 8.dp),
        textAlign = TextAlign.Center
    )
}
