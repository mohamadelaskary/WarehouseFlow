package com.melaskary.warehouseflow.core.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.melaskary.warehouseflow.core.ui.theme.ExceptionRed
import com.melaskary.warehouseflow.core.ui.theme.PutawayGreen
import com.melaskary.warehouseflow.core.ui.theme.TransitAmber

enum class WarehouseStatusTone { SUCCESS, ATTENTION, DANGER, NEUTRAL }

/**
 * A warehouse "label sticker" tag, not a rounded Material chip: a solid
 * colored tab with a hard-ish corner (4dp — see WarehouseShapes.small) and
 * bold small-caps-style label text. Reads instantly at a glance and at
 * distance, the way a physical shelf label does.
 */
@Composable
fun StatusChip(
    text: String,
    tone: WarehouseStatusTone,
    modifier: Modifier = Modifier
) {
    val (background, onColor) = when (tone) {
        WarehouseStatusTone.SUCCESS -> PutawayGreen to Color.White
        WarehouseStatusTone.ATTENTION -> TransitAmber to Color.White
        WarehouseStatusTone.DANGER -> ExceptionRed to Color.White
        WarehouseStatusTone.NEUTRAL -> MaterialTheme.colorScheme.surfaceVariant to MaterialTheme.colorScheme.onSurfaceVariant
    }

    Box(
        modifier = modifier
            .background(background, RoundedCornerShape(4.dp))
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelSmall,
            color = onColor
        )
    }
}
