package com.melaskary.warehouseflow.core.ui.theme

import androidx.compose.ui.graphics.Color

// --- Brand tokens ------------------------------------------------------
// Named deliberately after the physical world this app lives in (a
// warehouse floor), not generic Material role names. Avoid tying these
// to "primary/secondary" naming until they're mapped into the ColorScheme
// below — keep the source-of-truth names meaningful on their own.

val GraphiteInk = Color(0xFF23262B)      // primary text, dark surfaces
val Steel = Color(0xFF5B6470)            // secondary text / dividers
val WarehouseIndigo = Color(0xFF1F3A5F)  // brand primary (equipment-paint blue, not Material blue)
val WarehouseIndigoLight = Color(0xFF6E8FB5)
val SafetyAmber = Color(0xFFE8A33D)      // the one accent — used sparingly, for attention states
val SafetyAmberDeep = Color(0xFFB4750E)

val PutawayGreen = Color(0xFF3F7D4F)     // pallet confirmed / in stock
val ExceptionRed = Color(0xFFB23A34)     // damaged / rejected / sync failed
val TransitAmber = Color(0xFFB4750E)     // pending sync / in transit

val CanvasLight = Color(0xFFEFF1F0)      // cool off-white — not the warm-cream default
val CanvasLightElevated = Color(0xFFFFFFFF)
val CanvasDark = Color(0xFF14171A)
val CanvasDarkElevated = Color(0xFF1D2125)

val ScanReadoutBg = Color(0xFF10131A)    // near-black chip background for the barcode readout
val ScanReadoutText = Color(0xFF7CE0A8)  // LED-green monospace text on the readout chip
