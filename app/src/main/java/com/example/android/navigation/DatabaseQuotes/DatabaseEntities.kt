package com.example.android.navigation.DatabaseQuotes

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.android.navigation.Model.Quotes

@Entity
data class DatabaseQuotes constructor(
        @PrimaryKey
        val text: String,
        val author: String)

fun List<DatabaseQuotes>.asDomainModel(): List<Quotes> {
    return map {
        Quotes (
                text = it.text,
                author = it.author)
    }
}