package com.christiano.bolla.styles

import com.christiano.bolla.theme.ColorScheme
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.theme.colors.palette.Palette
import com.varabyte.kobweb.silk.theme.colors.palette.colorMode
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

private enum class LightColorScheme(val hex: String, val rgb: CSSColorValue, val silkRgb: Color) {
    Primary(hex = "#FF6750A4", rgb = rgb(103, 80, 164), silkRgb = Color.rgb(103, 80, 164)),
    OnPrimary(hex = "#FFFFFFFF", rgb = rgb(255, 255, 255), silkRgb = Color.rgb(255, 255, 255)),
    PrimaryContainer(hex = "#FFEADDFF", rgb = rgb(234, 221, 255), silkRgb = Color.rgb(234, 221, 255)),
    OnPrimaryContainer(hex = "#FF21005D", rgb = rgb(33, 0, 93), silkRgb = Color.rgb(33, 0, 93)),
    Secondary(hex = "#FF625B71", rgb = rgb(98, 91, 113), silkRgb = Color.rgb(98, 91, 113)),
    OnSecondary(hex = "#FFFFFFFF", rgb = rgb(255, 255, 255), silkRgb = Color.rgb(255, 255, 255)),
    SecondaryContainer(hex = "#FFE8DEF8", rgb = rgb(232, 222, 248), silkRgb = Color.rgb(232, 222, 248)),
    OnSecondaryContainer(hex = "#FF1D192B", rgb = rgb(29, 25, 43), silkRgb = Color.rgb(29, 25, 43)),
    Tertiary(hex = "#FF7D5260", rgb = rgb(125, 82, 96), silkRgb = Color.rgb(125, 82, 96)),
    OnTertiary(hex = "#FFFFFFFF", rgb = rgb(255, 255, 255), silkRgb = Color.rgb(255, 255, 255)),
    TertiaryContainer(hex = "#FFFFD8E4", rgb = rgb(255, 216, 228), silkRgb = Color.rgb(255, 216, 228)),
    OnTertiaryContainer(hex = "#FF31111D", rgb = rgb(49, 17, 29), silkRgb = Color.rgb(49, 17, 29)),
    Error(hex = "#FFB3261E", rgb = rgb(179, 38, 30), silkRgb = Color.rgb(179, 38, 30)),
    OnError(hex = "#FFFFFFFF", rgb = rgb(255, 255, 255), silkRgb = Color.rgb(255, 255, 255)),
    ErrorContainer(hex = "#FFF9DEDC", rgb = rgb(249, 222, 220), silkRgb = Color.rgb(249, 222, 220)),
    OnErrorContainer(hex = "#FF410E0B", rgb = rgb(65, 14, 11), silkRgb = Color.rgb(65, 14, 11)),
    Outline(hex = "#FF79747E", rgb = rgb(121, 116, 126), silkRgb = Color.rgb(121, 116, 126)),
    Background(hex = "#FFFFFBFE", rgb = rgb(255, 251, 254), silkRgb = Color.rgb(255, 251, 254)),
    OnBackground(hex = "#FF1C1B1F", rgb = rgb(28, 27, 31), silkRgb = Color.rgb(28, 27, 31)),
    Surface(hex = "#FFFFFBFE", rgb = rgb(255, 251, 254), silkRgb = Color.rgb(255, 251, 254)),
    OnSurface(hex = "#FF1C1B1F", rgb = rgb(28, 27, 31), silkRgb = Color.rgb(28, 27, 31)),
    SurfaceVariant(hex = "#FFE7E0EC", rgb = rgb(231, 224, 236), silkRgb = Color.rgb(231, 224, 236)),
    OnSurfaceVariant(hex = "#FF49454F", rgb = rgb(73, 69, 79), silkRgb = Color.rgb(73, 69, 79)),
    InverseSurface(hex = "#FF313033", rgb = rgb(49, 48, 51), silkRgb = Color.rgb(49, 48, 51)),
    OnInverseSurface(hex = "#FFF4EFF4", rgb = rgb(244, 239, 244), silkRgb = Color.rgb(244, 239, 244)),
    InversePrimary(hex = "#FFD0BCFF", rgb = rgb(208, 188, 255), silkRgb = Color.rgb(208, 188, 255)),
    Shadow(hex = "#FF000000", rgb = rgb(0, 0, 0), silkRgb = Color.rgb(0, 0, 0)),
    SurfaceTint(hex = "#FF6750A4", rgb = rgb(103, 80, 164), silkRgb = Color.rgb(103, 80, 164)),
    OutlineVariant(hex = "#FFCAC4D0", rgb = rgb(202, 196, 208), silkRgb = Color.rgb(202, 196, 208)),
    Scrim(hex = "#FF000000", rgb = rgb(0, 0, 0), silkRgb = Color.rgb(0, 0, 0)),


//    Gray(hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207), silkRgb = Color.rgb(r = 207, g = 207, b = 207)),
//    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237), silkRgb = Color.rgb(r = 237, g = 237, b = 237)),
//    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249), silkRgb = Color.rgb(r = 249, g = 249, b = 249));
}

private enum class DarkColorScheme(val hex: String, val rgb: CSSColorValue, val silkRgb: Color) {
    Primary(hex = "#FFD0BCFF", rgb = rgb(208,188,255), silkRgb = Color.rgb(208,188,255)),
    OnPrimary(hex = "#FF381E72", rgb = rgb(56, 30, 114), silkRgb = Color.rgb(56, 30, 114)),
    PrimaryContainer(hex = "#FF4F378B", rgb = rgb(79, 55, 139), silkRgb = Color.rgb(79, 55, 139)),
    OnPrimaryContainer(hex = "#FFEADDFF", rgb = rgb(234, 221, 255), silkRgb = Color.rgb(234, 221, 255)),
    Secondary(hex = "#FFCCC2DC", rgb = rgb(204, 194, 220), silkRgb = Color.rgb(204, 194, 220)),
    OnSecondary(hex = "#FF332D41", rgb = rgb(51, 45, 65), silkRgb = Color.rgb(51, 45, 65)),
    SecondaryContainer(hex = "#FF4A4458", rgb = rgb(74, 68, 88), silkRgb = Color.rgb(74, 68, 88)),
    OnSecondaryContainer(hex = "#FFE8DEF8", rgb = rgb(232, 222, 248), silkRgb = Color.rgb(232, 222, 248)),
    Tertiary(hex = "#FFEFB8C8", rgb = rgb(239, 184, 200), silkRgb = Color.rgb(239, 184, 200)),
    OnTertiary(hex = "#FF492532", rgb = rgb(73, 37, 50), silkRgb = Color.rgb(73, 37, 50)),
    TertiaryContainer(hex = "#FF633B48", rgb = rgb(99, 59, 72), silkRgb = Color.rgb(99, 59, 72)),
    OnTertiaryContainer(hex = "#FFFFD8E4", rgb = rgb(255, 216, 228), silkRgb = Color.rgb(255, 216, 228)),
    Error(hex = "#FFF2B8B5", rgb = rgb(242, 184, 181), silkRgb = Color.rgb(242, 184, 181)),
    OnError(hex = "#FF601410", rgb = rgb(96, 20, 16), silkRgb = Color.rgb(96, 20, 16)),
    ErrorContainer(hex = "#FF8C1D18", rgb = rgb(140, 29, 24), silkRgb = Color.rgb(140, 29, 24)),
    OnErrorContainer(hex = "#FFF9DEDC", rgb = rgb(249, 222, 220), silkRgb = Color.rgb(249, 222, 220)),
    Outline(hex = "#FF938F99", rgb = rgb(147, 143, 153), silkRgb = Color.rgb(147, 143, 153)),
    Background(hex = "#FF1C1B1F", rgb = rgb(28, 27, 31), silkRgb = Color.rgb(28, 27, 31)),
    OnBackground(hex = "#FFE6E1E5", rgb = rgb(230, 225, 229), silkRgb = Color.rgb(230, 225, 229)),
    Surface(hex = "#FF1C1B1F", rgb = rgb(28, 27, 31), silkRgb = Color.rgb(28, 27, 31)),
    OnSurface(hex = "#FFE6E1E5", rgb = rgb(230, 225, 229), silkRgb = Color.rgb(230, 225, 229)),
    SurfaceVariant(hex = "#FF49454F", rgb = rgb(73, 69, 79), silkRgb = Color.rgb(73, 69, 79)),
    OnSurfaceVariant(hex = "#FFCAC4D0", rgb = rgb(202, 196, 208), silkRgb = Color.rgb(202, 196, 208)),
    InverseSurface(hex = "#FFE6E1E5", rgb = rgb(230, 225, 229), silkRgb = Color.rgb(230, 225, 229)),
    OnInverseSurface(hex = "#FF313033", rgb = rgb(49, 48, 51), silkRgb = Color.rgb(49, 48, 51)),
    InversePrimary(hex = "#FF6750A4", rgb = rgb(103, 80, 164), silkRgb = Color.rgb(103, 80, 164)),
    Shadow(hex = "#FF000000", rgb = rgb(0, 0, 0), silkRgb = Color.rgb(0, 0, 0)),
    SurfaceTint(hex = "#FFD0BCFF", rgb = rgb(255,208,188), silkRgb = Color.rgb(255,208,188)),
    OutlineVariant(hex = "#FF49454F", rgb = rgb(73,69,79), silkRgb = Color.rgb(73,69,79)),
    Scrim(hex = "#FF000000", rgb = rgb(0, 0, 0), silkRgb = Color.rgb(0, 0, 0)),
}

val lightColorScheme = ColorScheme(
    primary = LightColorScheme.Primary.silkRgb,
    onPrimary = LightColorScheme.OnPrimary.silkRgb,
    primaryContainer = LightColorScheme.PrimaryContainer.silkRgb,
    onPrimaryContainer = LightColorScheme.OnPrimaryContainer.silkRgb,
    inversePrimary = LightColorScheme.InversePrimary.silkRgb,
    secondary = LightColorScheme.Secondary.silkRgb,
    onSecondary = LightColorScheme.OnSecondary.silkRgb,
    secondaryContainer = LightColorScheme.SecondaryContainer.silkRgb,
    onSecondaryContainer = LightColorScheme.OnSecondaryContainer.silkRgb,
    tertiary = LightColorScheme.Tertiary.silkRgb,
    onTertiary = LightColorScheme.OnTertiary.silkRgb,
    tertiaryContainer = LightColorScheme.TertiaryContainer.silkRgb,
    onTertiaryContainer = LightColorScheme.OnTertiaryContainer.silkRgb,
    background = LightColorScheme.Background.silkRgb,
    onBackground = LightColorScheme.OnBackground.silkRgb,
    surface = LightColorScheme.Surface.silkRgb,
    onSurface = LightColorScheme.OnSurface.silkRgb,
    surfaceVariant = LightColorScheme.SurfaceVariant.silkRgb,
    onSurfaceVariant = LightColorScheme.OnSurfaceVariant.silkRgb,
    surfaceTint = LightColorScheme.SurfaceTint.silkRgb,
    inverseSurface = LightColorScheme.InverseSurface.silkRgb,
    inverseOnSurface = LightColorScheme.OnInverseSurface.silkRgb,
    error = LightColorScheme.Error.silkRgb,
    onError = LightColorScheme.OnError.silkRgb,
    errorContainer = LightColorScheme.ErrorContainer.silkRgb,
    onErrorContainer = LightColorScheme.OnErrorContainer.silkRgb,
    outline = LightColorScheme.Outline.silkRgb,
    outlineVariant = LightColorScheme.OutlineVariant.silkRgb,
    scrim = LightColorScheme.Scrim.silkRgb,
    surfaceBright = LightColorScheme.Surface.silkRgb,
    surfaceDim = LightColorScheme.Surface.silkRgb,
    surfaceContainer = LightColorScheme.Surface.silkRgb,
    surfaceContainerHigh = LightColorScheme.Surface.silkRgb,
    surfaceContainerHighest = LightColorScheme.Surface.silkRgb,
    surfaceContainerLow = LightColorScheme.Surface.silkRgb,
    surfaceContainerLowest = LightColorScheme.Surface.silkRgb,
)

val darkColorScheme = ColorScheme(
    primary = DarkColorScheme.Primary.silkRgb,
    onPrimary = DarkColorScheme.OnPrimary.silkRgb,
    primaryContainer = DarkColorScheme.PrimaryContainer.silkRgb,
    onPrimaryContainer = DarkColorScheme.OnPrimaryContainer.silkRgb,
    inversePrimary = DarkColorScheme.InversePrimary.silkRgb,
    secondary = DarkColorScheme.Secondary.silkRgb,
    onSecondary = DarkColorScheme.OnSecondary.silkRgb,
    secondaryContainer = DarkColorScheme.SecondaryContainer.silkRgb,
    onSecondaryContainer = DarkColorScheme.OnSecondaryContainer.silkRgb,
    tertiary = DarkColorScheme.Tertiary.silkRgb,
    onTertiary = DarkColorScheme.OnTertiary.silkRgb,
    tertiaryContainer = DarkColorScheme.TertiaryContainer.silkRgb,
    onTertiaryContainer = DarkColorScheme.OnTertiaryContainer.silkRgb,
    background = DarkColorScheme.Background.silkRgb,
    onBackground = DarkColorScheme.OnBackground.silkRgb,
    surface = DarkColorScheme.Surface.silkRgb,
    onSurface = DarkColorScheme.OnSurface.silkRgb,
    surfaceVariant = DarkColorScheme.SurfaceVariant.silkRgb,
    onSurfaceVariant = DarkColorScheme.OnSurfaceVariant.silkRgb,
    surfaceTint = DarkColorScheme.SurfaceTint.silkRgb,
    inverseSurface = DarkColorScheme.InverseSurface.silkRgb,
    inverseOnSurface = DarkColorScheme.OnInverseSurface.silkRgb,
    error = DarkColorScheme.Error.silkRgb,
    onError = DarkColorScheme.OnError.silkRgb,
    errorContainer = DarkColorScheme.ErrorContainer.silkRgb,
    onErrorContainer = DarkColorScheme.OnErrorContainer.silkRgb,
    outline = DarkColorScheme.Outline.silkRgb,
    outlineVariant = DarkColorScheme.OutlineVariant.silkRgb,
    scrim = DarkColorScheme.Scrim.silkRgb,
    surfaceBright = DarkColorScheme.Surface.silkRgb,
    surfaceDim = DarkColorScheme.Surface.silkRgb,
    surfaceContainer = DarkColorScheme.Surface.silkRgb,
    surfaceContainerHigh = DarkColorScheme.Surface.silkRgb,
    surfaceContainerHighest = DarkColorScheme.Surface.silkRgb,
    surfaceContainerLow = DarkColorScheme.Surface.silkRgb,
    surfaceContainerLowest = DarkColorScheme.Surface.silkRgb,
)

val Palette.primary get() = if (colorMode.isDark) darkColorScheme.primary else lightColorScheme.primary
val Palette.onPrimary get() = if (colorMode.isDark) darkColorScheme.onPrimary else lightColorScheme.onPrimary
val Palette.secondaryContainer get() = if (colorMode.isDark) darkColorScheme.secondaryContainer else lightColorScheme.secondaryContainer
val Palette.onSecondaryContainer get() = if (colorMode.isDark) darkColorScheme.onSecondaryContainer else lightColorScheme.onSecondaryContainer
val Palette.tertiary get() = if (colorMode.isDark) darkColorScheme.tertiary else lightColorScheme.tertiary
val Palette.onBackground get() = if (colorMode.isDark) darkColorScheme.onBackground else lightColorScheme.onBackground
val Palette.surface get() = if (colorMode.isDark) darkColorScheme.surface else lightColorScheme.surface
val Palette.onSurface get() = if (colorMode.isDark) darkColorScheme.onSurface else lightColorScheme.onSurface
val Palette.outlineVariant get() = if (colorMode.isDark) darkColorScheme.outlineVariant else lightColorScheme.outlineVariant
val Palette.inverseSurface get() = if (colorMode.isDark) darkColorScheme.inverseSurface else lightColorScheme.inverseSurface
val Palette.inverseOnSurface get() = if (colorMode.isDark) darkColorScheme.inverseOnSurface else lightColorScheme.inverseOnSurface
val Palette.inversePrimary get() = if (colorMode.isDark) darkColorScheme.inversePrimary else lightColorScheme.inversePrimary
val Palette.surfaceVariant get() = if (colorMode.isDark) darkColorScheme.surfaceVariant else lightColorScheme.surfaceVariant
val Palette.onSurfaceVariant get() = if (colorMode.isDark) darkColorScheme.onSurfaceVariant else lightColorScheme.onSurfaceVariant
