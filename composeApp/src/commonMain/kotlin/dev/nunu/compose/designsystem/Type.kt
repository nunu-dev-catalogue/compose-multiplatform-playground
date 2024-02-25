@file:OptIn(ExperimentalResourceApi::class)

package dev.nunu.compose.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import composemultiplatformdemo.composeapp.generated.resources.Res
import composemultiplatformdemo.composeapp.generated.resources.pretendard_medium
import composemultiplatformdemo.composeapp.generated.resources.pretendard_regular
import composemultiplatformdemo.composeapp.generated.resources.pretendard_semibold
import composemultiplatformdemo.composeapp.generated.resources.stretch_pro
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

val StretchPro: FontFamily
    @Composable
    get() = FontFamily(Font(resource = Res.font.stretch_pro))

val PretendardMedium: FontFamily
    @Composable
    get() = FontFamily(Font(resource = Res.font.pretendard_medium))

val PretendardRegular: FontFamily
    @Composable
    get() = FontFamily(Font(resource = Res.font.pretendard_regular))

val PretendardSemiBold: FontFamily
    @Composable
    get() = FontFamily(Font(resource = Res.font.pretendard_semibold))

@Stable
class TodoTypography(
    title: TextStyle,
    semiBold: TextStyle,
    medium1: TextStyle,
    medium2: TextStyle,
    regular1: TextStyle,
    regular2: TextStyle
) {
    var title: TextStyle by mutableStateOf(title)
        private set
    var semiBold: TextStyle by mutableStateOf(semiBold)
        private set
    var medium1: TextStyle by mutableStateOf(medium1)
        private set
    var medium2: TextStyle by mutableStateOf(medium2)
        private set
    var regular1: TextStyle by mutableStateOf(regular1)
        private set
    var regular2: TextStyle by mutableStateOf(regular2)
        private set

    fun update(other: TodoTypography) {
        title = other.title
        semiBold = other.semiBold
        medium1 = other.medium1
        medium2 = other.medium2
        regular1 = other.regular1
        regular2 = other.regular2
    }

    fun copy(
        title: TextStyle = this.title,
        semiBold: TextStyle = this.semiBold,
        medium1: TextStyle = this.medium1,
        medium2: TextStyle = this.medium2,
        regular1: TextStyle = this.regular1,
        regular2: TextStyle = this.regular2
    ): TodoTypography = TodoTypography(title, semiBold, medium1, medium2, regular1, regular2)
}

@Composable
fun todoTypography(): TodoTypography {
    return TodoTypography(
        title = TextStyle(
            fontFamily = StretchPro,
            fontSize = 24.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = (-0.5).sp
        ),
        semiBold = TextStyle(
            fontFamily = PretendardSemiBold,
            fontSize = 16.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (-0.5).sp
        ),
        medium1 = TextStyle(
            fontFamily = PretendardMedium,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = (-0.5).sp
        ),
        medium2 = TextStyle(
            fontFamily = PretendardMedium,
            fontSize = 13.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.Medium,
            letterSpacing = (-0.5).sp
        ),
        regular1 = TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (-0.5).sp
        ),
        regular2 = TextStyle(
            fontFamily = PretendardRegular,
            fontSize = 12.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.Normal
        )
    )
}
