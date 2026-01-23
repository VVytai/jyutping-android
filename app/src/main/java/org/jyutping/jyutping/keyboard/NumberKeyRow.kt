package org.jyutping.jyutping.keyboard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import org.jyutping.jyutping.models.VirtualInputKey

@Composable
fun NumberKeyRow(height: Dp) {
        Row(
                modifier = Modifier
                        .height(height)
                        .fillMaxWidth()
        ) {
                NumberKey(VirtualInputKey.number1, modifier = Modifier.weight(1f), position = Alignment.Start)
                NumberKey(VirtualInputKey.number2, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number3, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number4, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number5, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number6, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number7, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number8, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number9, modifier = Modifier.weight(1f))
                NumberKey(VirtualInputKey.number0, modifier = Modifier.weight(1f), position = Alignment.End)
        }
}
