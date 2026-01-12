package org.jyutping.jyutping.models

import org.jyutping.jyutping.CharacterStandard
import org.jyutping.jyutping.keyboard.transformed
import org.jyutping.jyutping.utilities.DatabaseHelper

object Converter {
        fun dispatch(memory: List<Lexicon>, marks: List<Lexicon>, symbols: List<Lexicon>, queried: List<Lexicon>, standard: CharacterStandard, db: DatabaseHelper): List<Lexicon> {
                val idealMemory = memory.filter { it.isIdealInputMemory }
                val notIdealMemory = memory.filter { it.isNotIdealInputMemory }
                val chained: MutableList<Lexicon> = if (idealMemory.isEmpty()) queried.toMutableList() else queried.filterNot { it.isCompound }.toMutableList()
                for (entry in notIdealMemory.reversed()) {
                        val index = chained.indexOfFirst { it.inputCount <= entry.inputCount }
                        if (index >= 0) {
                                chained.add(index = index, element = entry)
                        } else {
                                chained.add(entry)
                        }
                }
                chained.addAll(index = 0, elements = idealMemory + marks)
                for (symbol in symbols.reversed()) {
                        val index = chained.indexOfFirst { it.type.isCantonese() && it.lexiconText == symbol.lexiconText && it.romanization == symbol.romanization }
                        if (index >= 0) {
                                chained.add(index = index + 1, element = symbol)
                        }
                }
                return chained.map { it.transformed(standard, db) }.distinct()
        }
}
