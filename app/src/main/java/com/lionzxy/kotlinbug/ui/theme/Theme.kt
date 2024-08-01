package com.lionzxy.kotlinbug.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun Kotlin220BugTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        content = content
    )
}