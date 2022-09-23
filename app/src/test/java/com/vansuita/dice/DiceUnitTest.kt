package com.vansuita.dice

import org.junit.Test

import org.junit.Assert.*

class DiceUnitTest {

    @Test
    fun shouldGiveCorrectResultOnSixSideRangeDice() {
        //given
        val dice = Dice(6)

        //when
        val result = dice.roll()

        //then
        assertTrue(result >= 1)
        assertTrue(result <= 6)
    }

    @Test
    fun shouldGiveCorrectResultOnEightSideRangeDice() {
        //given
        val sides = 8
        val dice = Dice(sides)

        //when
        val result = dice.roll()

        //then
        assertTrue(result >= 1)
        assertTrue(result <= sides)
    }

    @Test
    fun shouldGiveCorrectResultOnTwentySideRangeDice() {
        //given
        val sides = 20
        val dice = Dice(sides)

        //when
        val result = dice.roll()

        //then
        assertTrue(IntRange(1, sides).contains(result))
    }
}