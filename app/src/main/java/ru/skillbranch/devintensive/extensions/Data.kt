package ru.skillbranch.devintensive.Extensions

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(pattern:String="HH:mm:ss dd.MM.yy"):String{
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this);
}

val SECONDS = 1000L
val MINUTES = SECONDS * 60
val HOURS = MINUTES * 60
val DAYS = HOURS * 24

private fun Date.humanizeDiff(data:Date=Date()):String{

    return ""
}

fun Date.add(value:Int,units:TimeUnits = TimeUnits.SECOND):Date
{
    var time = this.time;
    time += when(units)
    {
        TimeUnits.SECOND -> value * SECONDS
        TimeUnits.MINUTE -> value * MINUTES
        TimeUnits.HOUR -> value * HOURS
        TimeUnits.DAY -> value * DAYS
    }
    this.time = time;
    return this;
}

enum class TimeUnits
{
    SECOND,
    MINUTE,
    HOUR,
    DAY;
}