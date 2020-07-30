package com.jeprubio.leapyears.domain.model

import junit.framework.TestCase.*
import org.junit.Test

class YearItemTest {
    @Test
    fun `Year info can be stored for leap years`() {
        // Act
        val yearInfo = YearItem(2020, YearType.LeapYear)

        // Assert
        assertEquals(2020, yearInfo.year)
        assertEquals(YearType.LeapYear, yearInfo.yearType)
    }

    @Test
    fun `Year info can be stored for common years`() {
        // Act
        val yearInfo = YearItem(2019, YearType.CommonYear)

        // Assert
        assertEquals(2019, yearInfo.year)
        assertEquals(YearType.CommonYear, yearInfo.yearType)
    }

    @Test
    fun `Year info can be stored for undefined years`() {
        // Act
        val yearInfo = YearItem(2018, YearType.Undefined)

        // Assert
        assertEquals(2018, yearInfo.year)
        assertEquals(YearType.Undefined, yearInfo.yearType)
    }
}