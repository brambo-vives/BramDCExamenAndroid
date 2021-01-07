
package com.example.android.navigation.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.android.navigation.DatabaseQuotes.QuotesDatabase
import com.example.android.navigation.DatabaseQuotes.asDomainModel
import com.example.android.navigation.Model.Quotes
import com.example.android.navigation.Network.Network
import com.example.android.navigation.Network.asDatabaseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuotesRepository(private val database: QuotesDatabase) {

    val quotes: LiveData<List<Quotes>> = Transformations.map(database.quoteDao.getQuotes()) {
        it.asDomainModel()
    }

    suspend fun refreshQuotes() {
        withContext(Dispatchers.IO) {
            val playlist = Network.devbytes.getPlaylist().await()
            database.quoteDao.insertAll(*playlist.asDatabaseModel())
        }
    }

}
