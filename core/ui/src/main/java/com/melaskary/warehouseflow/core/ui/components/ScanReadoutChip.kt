package com.melaskary.warehouseflow.core.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.melaskary.warehouseflow.core.ui.theme.ScanReadoutBg
import com.melaskary.warehouseflow.core.ui.theme.ScanReadoutStyle
import com.melaskary.warehouseflow.core.ui.theme.ScanReadoutText

/**
 * The app's signature visual element: a barcode value rendered like a
 * scanner's own LCD readout line — near-black chip, LED-green monospace,
 * wide letter-spacing. Used anywhere a scanned code is displayed, so the
 * app visually "speaks" the language of the hardware it runs on.
 *
 * Deliberately NOT reused as a generic text style elsewhere — its meaning
 * is "this value came from a scan", so it only appears in that context.
 */
@Composable
fun ScanReadoutChip(
    code: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(ScanReadoutBg, RoundedCornerShape(2.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Text(
            text = code,
            style = ScanReadoutStyle,
            color = ScanReadoutText
        )
    }
}
