
package com.example.android.navigation.Work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Operation.SUCCESS
import com.example.android.navigation.Repository.QuotesRepository
import androidx.work.WorkerParameters

import com.example.android.navigation.DatabaseQuotes.QuotesDatabase
import com.example.android.navigation.DatabaseQuotes.getDatabase
import retrofit2.HttpException


class RefreshDataWorker(appContext: Context, params: WorkerParameters):
        CoroutineWorker(appContext, params) {

    companion object {
        const val WORK_NAME = "RefreshDataWorker"
    }

    override suspend fun doWork(): Result {
        val database = getDatabase(applicationContext)
        val repository = QuotesRepository(database)
        return try {
            repository.refreshQuotes()
            Result.success()
        } catch (e: HttpException) {
            Result.retry()
        }
    }

}