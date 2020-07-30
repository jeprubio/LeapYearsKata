package com.jeprubio.leapyears.presentation.viewmodel

import org.junit.Assert.assertEquals
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

}