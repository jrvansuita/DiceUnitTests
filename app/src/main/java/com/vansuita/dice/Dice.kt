package com.vansuita.dice

data class Dice(val sides: Int) {
    fun roll(): Int {
        return IntRange(1, sides).random()
    }
}


