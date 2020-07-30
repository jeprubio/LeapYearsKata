package com.jeprubio.leapyears.domain.model

enum class YearType {
    Undefined,
    LeapYear,
    CommonYear
}

data class YearItem(val year: Long, val yearType: YearType)