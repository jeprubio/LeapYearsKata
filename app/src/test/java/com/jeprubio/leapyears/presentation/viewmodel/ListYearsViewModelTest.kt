package com.jeprubio.leapyears.presentation.viewmodel

import junit.framework.TestCase.assertFalse
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ListYearsViewModelTest {
    private var sut = ListYearsViewModel()

    @Test
    fun `Can create a list of years with all years as common year from a parameter pass down to 0`() {
        // Arrange
        val initialYear = 2020

        // Act
        val yearsList = sut.createYearsList(initialYear)

        // Assert
        assertEquals(initialYear + 1, yearsList.size)
    }

    @Test
    fun `All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year)`() {
        // Arrange
        val testYear = 2000

        // Act
        val response = sut.isLeapYear(testYear)

        // Assert
        assertTrue(response)
    }

    @Test
    fun `All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year)`() {
        // Act
        val responseFor1700 = sut.isLeapYear(1700)
        val responseFor1800 = sut.isLeapYear(1800)
        val responseFor1900 = sut.isLeapYear(1900)
        val responseFor2100 = sut.isLeapYear(2100)

        // Assert
        assertFalse(responseFor1700)
        assertFalse(responseFor1800)
        assertFalse(responseFor1900)
        assertFalse(responseFor2100)
    }

    @Test
    fun `All years divisible by 4 but not by 100 ARE leap years (for example, 2008, 2012, 2016)`() {
        val responseFor2008 = sut.isLeapYear(2008)
        val responseFor2012 = sut.isLeapYear(2012)
        val responseFor2016 = sut.isLeapYear(2016)

        // Assert
        assertTrue(responseFor2008)
        assertTrue(responseFor2012)
        assertTrue(responseFor2016)
    }

}