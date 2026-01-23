package org.jyutping.jyutping.keyboard

import android.view.KeyEvent
import org.jyutping.jyutping.models.VirtualInputKey

/**
 * Map Android KeyEvent keyCode to the internal VirtualInputKey used by the IME.
 * Keep mapping small and ASCII-only for the first pass.
 */
object PhysicalKeyMapper {

    private val mapping: Map<Int, VirtualInputKey> = mapOf(
        KeyEvent.KEYCODE_A to VirtualInputKey.letterA,
        KeyEvent.KEYCODE_B to VirtualInputKey.letterB,
        KeyEvent.KEYCODE_C to VirtualInputKey.letterC,
        KeyEvent.KEYCODE_D to VirtualInputKey.letterD,
        KeyEvent.KEYCODE_E to VirtualInputKey.letterE,
        KeyEvent.KEYCODE_F to VirtualInputKey.letterF,
        KeyEvent.KEYCODE_G to VirtualInputKey.letterG,
        KeyEvent.KEYCODE_H to VirtualInputKey.letterH,
        KeyEvent.KEYCODE_I to VirtualInputKey.letterI,
        KeyEvent.KEYCODE_J to VirtualInputKey.letterJ,
        KeyEvent.KEYCODE_K to VirtualInputKey.letterK,
        KeyEvent.KEYCODE_L to VirtualInputKey.letterL,
        KeyEvent.KEYCODE_M to VirtualInputKey.letterM,
        KeyEvent.KEYCODE_N to VirtualInputKey.letterN,
        KeyEvent.KEYCODE_O to VirtualInputKey.letterO,
        KeyEvent.KEYCODE_P to VirtualInputKey.letterP,
        KeyEvent.KEYCODE_Q to VirtualInputKey.letterQ,
        KeyEvent.KEYCODE_R to VirtualInputKey.letterR,
        KeyEvent.KEYCODE_S to VirtualInputKey.letterS,
        KeyEvent.KEYCODE_T to VirtualInputKey.letterT,
        KeyEvent.KEYCODE_U to VirtualInputKey.letterU,
        KeyEvent.KEYCODE_V to VirtualInputKey.letterV,
        KeyEvent.KEYCODE_W to VirtualInputKey.letterW,
        KeyEvent.KEYCODE_X to VirtualInputKey.letterX,
        KeyEvent.KEYCODE_Y to VirtualInputKey.letterY,
        KeyEvent.KEYCODE_Z to VirtualInputKey.letterZ,

        KeyEvent.KEYCODE_0 to VirtualInputKey.number0,
        KeyEvent.KEYCODE_1 to VirtualInputKey.number1,
        KeyEvent.KEYCODE_2 to VirtualInputKey.number2,
        KeyEvent.KEYCODE_3 to VirtualInputKey.number3,
        KeyEvent.KEYCODE_4 to VirtualInputKey.number4,
        KeyEvent.KEYCODE_5 to VirtualInputKey.number5,
        KeyEvent.KEYCODE_6 to VirtualInputKey.number6,
        KeyEvent.KEYCODE_7 to VirtualInputKey.number7,
        KeyEvent.KEYCODE_8 to VirtualInputKey.number8,
        KeyEvent.KEYCODE_9 to VirtualInputKey.number9,

        KeyEvent.KEYCODE_APOSTROPHE to VirtualInputKey.apostrophe,
        KeyEvent.KEYCODE_GRAVE to VirtualInputKey.grave
    )

    fun map(keyCode: Int): VirtualInputKey? = mapping[keyCode]

    fun isPrintable(keyCode: Int): Boolean = mapping.containsKey(keyCode)
}
