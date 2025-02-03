package com.example.tp2

import android.icu.util.Calendar

class AgeCalculator {
    companion object {
        fun calculateAge(birthYear: Int): Int {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            return currentYear - birthYear
        }
    }
}