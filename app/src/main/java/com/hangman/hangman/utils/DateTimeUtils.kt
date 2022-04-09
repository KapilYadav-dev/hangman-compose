package com.hangman.hangman.utils

import java.text.SimpleDateFormat
import java.util.*


fun getDateAndTime(): Pair<String, String> {
    val dateAndTimeFormat = SimpleDateFormat("dd MMM,hh:mm a", Locale.getDefault())
    val dateAndTime: String = dateAndTimeFormat.format(Calendar.getInstance().time)
    val date = dateAndTime.substringBefore(delimiter = ",")
    val time = dateAndTime.substringAfter(delimiter = ",")
    return Pair(date, time)
}