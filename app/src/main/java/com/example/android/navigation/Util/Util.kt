

//package com.example.android.navigation.Util
//
//import android.annotation.SuppressLint
//import android.content.res.Resources
//import android.os.Build
//import android.text.Html
//import android.text.Spanned
//import androidx.core.text.HtmlCompat
//import com.example.android.navigation.Database.FitTijd
//
//import com.example.android.navigation.R
//import java.text.SimpleDateFormat
//
//
//
//
//
//
//@SuppressLint("SimpleDateFormat")
//fun convertLongToDateString(systemTime: Long): String {
//    return SimpleDateFormat("EEEE MMM-dd-yyyy' Time: 'HH:mm")
//            .format(systemTime).toString()
//}
//
//
//fun formatNights(nights: List<FitTijd>, resources: Resources): Spanned {
//    val sb = StringBuilder()
//    sb.apply {
//        append(resources.getString(R.string.title))
//        nights.forEach {
//            append("<br>")
//            append(resources.getString(R.string.start_time))
//            append("\t${convertLongToDateString(it.startTimeMilli)}<br>")
//            if (it.endTimeMilli != it.startTimeMilli) {
//                append(resources.getString(R.string.end_time))
//                append("\t${convertLongToDateString(it.endTimeMilli)}<br>")
//                append(resources.getString(R.string.quality))
//
//                append(resources.getString(R.string.hours_slept))
//                // Hours
//                append("\t ${it.endTimeMilli.minus(it.startTimeMilli) / 1000 / 60 / 60}:")
//                // Minutes
//                append("${it.endTimeMilli.minus(it.startTimeMilli) / 1000 / 60}:")
//                // Seconds
//                append("${it.endTimeMilli.minus(it.startTimeMilli) / 1000}<br><br>")
//            }
//        }
//    }
//    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//        return Html.fromHtml(sb.toString(), Html.FROM_HTML_MODE_LEGACY)
//    } else {
//        return HtmlCompat.fromHtml(sb.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY)
//    }
//}