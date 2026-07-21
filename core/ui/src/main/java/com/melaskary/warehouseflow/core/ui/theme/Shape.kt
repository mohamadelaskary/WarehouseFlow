package com.melaskary.warehouseflow.core.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Deliberately restrained corner radii. Material3's default shape scale
// rounds almost everything into pill shapes — fine for a consumer social
// app, wrong for a floor-operations tool. Small, consistent radii read as
// "instrument" rather than "app store default".
val WarehouseShapes = Shapes(
    extraSmall = RoundedCornerShape(2.dp),   // the scan readout chip — near-sharp, like an LED display
    small = RoundedCornerShape(4.dp),        // status tags, chips
    medium = RoundedCornerShape(6.dp),       // cards, list rows
    large = RoundedCornerShape(8.dp),        // sheets, dialogs
    extraLarge = RoundedCornerShape(10.dp)
)
