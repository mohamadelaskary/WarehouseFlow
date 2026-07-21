package com.melaskary.warehouseflow.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// --- Font families -------------------------------------------------------
// Design intent: IBM Plex Sans (Latin) + IBM Plex Sans Arabic pair natively —
// both were drawn by the same type team specifically to sit together, so
// English and Arabic body text share the same rhythm and x-height instead of
// looking like two unrelated typefaces stitched together. Pallet codes and
// serials use IBM Plex Mono, styled like a scanner's own LCD readout.
//
// TO ACTIVATE THE REAL TYPEFACES (not bundled here — binary font files can't
// be generated as text):
//   1. Download from Google Fonts: "IBM Plex Sans", "IBM Plex Sans Arabic",
//      "IBM Plex Mono" (Regular + SemiBold weights of each).
//   2. Drop the .ttf files into core/ui/src/main/res/font/
//      e.g. ibm_plex_sans_regular.ttf, ibm_plex_sans_semibold.ttf,
//           ibm_plex_sans_arabic_regular.ttf, ibm_plex_sans_arabic_semibold.ttf,
//           ibm_plex_mono_medium.ttf
//   3. Replace the FontFamily.SansSerif / FontFamily.Monospace references
//      below with:
//        FontFamily(
//            Font(R.font.ibm_plex_sans_regular, FontWeight.Normal),
//            Font(R.font.ibm_plex_sans_semibold, FontWeight.SemiBold)
//        )
//      Compose + the Android resource system pick the Arabic cut
//      automatically only if you register it as a separate family and
//      swap it in for RTL locales (see AppTypography() below).
//
// Until then, the code below runs immediately using the platform's system
// sans/monospace fallback, so the project builds and looks intentional out
// of the box — swapping in Plex later is a pure drop-in, no structural change.

val WarehouseSans = FontFamily.SansSerif
val WarehouseMono = FontFamily.Monospace

val WarehouseTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    labelLarge = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.4.sp
    ),
    labelSmall = TextStyle(
        fontFamily = WarehouseSans,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        letterSpacing = 0.6.sp
    )
)

// A distinct style, not part of Material's type scale, reserved for the
// scan-readout chip: wide letter-spacing + monospace mimics a barcode
// scanner's own LCD line.
val ScanReadoutStyle = TextStyle(
    fontFamily = WarehouseMono,
    fontWeight = FontWeight.Medium,
    fontSize = 15.sp,
    letterSpacing = 2.sp
)
