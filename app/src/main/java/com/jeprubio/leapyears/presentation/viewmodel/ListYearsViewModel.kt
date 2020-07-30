package com.jeprubio.leapyears.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeprubio.leapyears.domain.model.YearItem
import com.jeprubio.leapyears.domain.model.YearType

class ListYearsViewModel : ViewModel() {
    private val _yearsList = MutableLiveData<List<YearItem>>()
    val yearsList: LiveData<List<YearItem>> = _yearsList

    fun createYearsList(initialYear: Int) {
        val yearsList = mutableListOf<YearItem>()
        for (year in initialYear downTo 1752) {
            val yearType = if (isLeapYear(year)) YearType.LeapYear else YearType.CommonYear
            yearsList.add(YearItem(year.toLong(), yearType))
        }
        _yearsList.value = yearsList
    }

    fun isLeapYear(year: Int): Boolean {
        return (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
    }
}