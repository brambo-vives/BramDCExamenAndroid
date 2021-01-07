
package com.example.android.navigation.viewModels

import android.app.Application
import androidx.lifecycle.*
import com.example.android.navigation.DatabaseQuotes.getDatabase
import com.example.android.navigation.Repository.QuotesRepository

import kotlinx.coroutines.*

class ViewModels(application: Application) : AndroidViewModel(application) {

    private val database = getDatabase(application)
    private val quotesRepository = QuotesRepository(database)

    init {
        viewModelScope.launch {
            try {
                quotesRepository.refreshQuotes()
            } catch (e: Exception) {}
        }
    }

    val playlist = quotesRepository.quotes

    /**
     * Factory for constructing DevByteViewModel with parameter
     */
    class Factory(val app: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ViewModels::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return ViewModels(app) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}
