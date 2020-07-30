package com.jeprubio.leapyears.domain.model

import junit.framework.TestCase.*
import org.junit.Test

class YearItemTest {
    @Test
    fun `Year info can be stored for leap years`() {
        // Act
        val yearInfo = YearItem(2020, true)

        // Assert
        assertEquals(2020, yearInfo.year)
        assertTrue(yearInfo.isLeapYear)
    }

    @Test
    fun `Year info can be stored for common years`() {
        // Act
        val yearInfo = YearItem(2019, false)

        // Assert
        assertEquals(2019, yearInfo.year)
        assertFalse(yearInfo.isLeapYear)
    }
}