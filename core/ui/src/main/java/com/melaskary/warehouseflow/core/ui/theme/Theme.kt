package com.melaskary.warehouseflow.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

/**
 * Explicit theme mode — deliberately not just "follow the system". Warehouse
 * floor lighting varies a lot more than office lighting, so operators get a
 * manual override in Settings in addition to a System default.
 */
enum class ThemeMode { LIGHT, DARK, SYSTEM }

private val LightColors = lightColorScheme(
    primary = WarehouseIndigo,
    onPrimary = CanvasLightElevated,
    primaryContainer = WarehouseIndigoLight,
    onPrimaryContainer = GraphiteInk,
    secondary = Steel,
    onSecondary = CanvasLightElevated,
    background = CanvasLight,
    onBackground = GraphiteInk,
    surface = CanvasLightElevated,
    onSurface = GraphiteInk,
    surfaceVariant = CanvasLight,
    onSurfaceVariant = Steel,
    error = ExceptionRed,
    onError = CanvasLightElevated
)

private val DarkColors = darkColorScheme(
    primary = WarehouseIndigoLight,
    onPrimary = GraphiteInk,
    primaryContainer = WarehouseIndigo,
    onPrimaryContainer = CanvasLightElevated,
    secondary = Steel,
    onSecondary = CanvasDarkElevated,
    background = CanvasDark,
    onBackground = CanvasLight,
    surface = CanvasDarkElevated,
    onSurface = CanvasLight,
    surfaceVariant = CanvasDarkElevated,
    onSurfaceVariant = Steel,
    error = ExceptionRed,
    onError = CanvasLightElevated
)

@Composable
fun WarehouseFlowTheme(
    themeMode: ThemeMode = ThemeMode.SYSTEM,
    content: @Composable () -> Unit
) {
    val useDarkTheme = when (themeMode) {
        ThemeMode.LIGHT -> false
        ThemeMode.DARK -> true
        ThemeMode.SYSTEM -> isSystemInDarkTheme()
    }
    val colorScheme = if (useDarkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = WarehouseTypography,
        shapes = WarehouseShapes,
        content = content
    )
}
