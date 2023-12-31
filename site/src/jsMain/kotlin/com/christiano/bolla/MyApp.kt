package com.christiano.bolla

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import com.christiano.bolla.styles.darkColorScheme
import com.christiano.bolla.styles.lightColorScheme
import com.varabyte.kobweb.compose.ui.graphics.lightened
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.*
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.vh

private const val COLOR_MODE_KEY = "app:colorMode"

@InitSilk
fun updateTheme(ctx: InitSilkContext) {
    ctx.config.initialColorMode = localStorage.getItem(COLOR_MODE_KEY)?.let { ColorMode.valueOf(it) } ?: ColorMode.DARK

    // Background
    ctx.theme.palettes.light.background = lightColorScheme.background
    ctx.theme.palettes.dark.background = darkColorScheme.background

    // Color
    ctx.theme.palettes.light.color = lightColorScheme.onBackground
    ctx.theme.palettes.dark.color = darkColorScheme.onBackground

    // Button
    ctx.theme.palettes.light.button.set(
        default = lightColorScheme.primary,
        hover = lightColorScheme.primary.darkened(0.08f),
        focus = lightColorScheme.primary.darkened(0.12f),
        pressed = lightColorScheme.primary.darkened(0.12f),
    )
    ctx.theme.palettes.dark.button.set(
        default = darkColorScheme.primary,
        hover = darkColorScheme.primary.lightened(0.08f),
        focus = darkColorScheme.primary.lightened(0.12f),
        pressed = darkColorScheme.primary.lightened(0.12f),
    )

    // Link
    ctx.theme.palettes.light.link.set(
        lightColorScheme.onBackground,
        lightColorScheme.onBackground
    )
    ctx.theme.palettes.dark.link.set(
        darkColorScheme.onBackground,
        darkColorScheme.onBackground
    )
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        val colorMode by ColorMode.currentState

        LaunchedEffect(colorMode) {
            localStorage.setItem(COLOR_MODE_KEY, colorMode.name)
        }

        Surface(
            modifier = SmoothColorStyle.toModifier().minHeight(100.vh)
        ) {
            content()
        }
    }
}
