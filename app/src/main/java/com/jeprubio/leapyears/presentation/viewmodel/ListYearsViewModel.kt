package com.jeprubio.leapyears.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.jeprubio.leapyears.domain.model.YearItem
import com.jeprubio.leapyears.domain.model.YearType

class ListYearsViewModel : ViewModel() {
    fun createYearsList(initialYear: Int): List<YearItem> {
        val yearsList = mutableListOf<YearItem>()
        for (year in initialYear downTo 0) {
            yearsList.add(YearItem(year.toLong(), YearType.Undefined))
        }
        return yearsList
    }

    fun isLeapYear(year: Int): Boolean {
        if (year % 400 == 0)
            return true

        return false
    }
}