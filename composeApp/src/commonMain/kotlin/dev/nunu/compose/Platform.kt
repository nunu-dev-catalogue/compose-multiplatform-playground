package dev.nunu.compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform