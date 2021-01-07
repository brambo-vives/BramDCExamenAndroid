
package com.example.android.navigation.Network


import com.example.android.navigation.DatabaseQuotes.DatabaseQuotes
import com.example.android.navigation.Model.Quotes
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class NetworkQuotesContainer(val videos: List<NetworkQuotes>)

@JsonClass(generateAdapter = true)
data class NetworkQuotes(
        val text: String,
        val author: String
       )

/**
 * Convert Network results to database objects
 */
fun NetworkQuotesContainer.asDomainModel(): List<Quotes> {
    return videos.map {
        Quotes(
                text = it.text,
                author = it.author
                )
    }
}

fun NetworkQuotesContainer.asDatabaseModel(): Array<DatabaseQuotes> {
    return videos.map {
        DatabaseQuotes (
                text = it.text,
                author = it.author
              )
    }.toTypedArray()
}