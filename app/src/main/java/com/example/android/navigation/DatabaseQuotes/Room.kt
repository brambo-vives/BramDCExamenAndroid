
package com.example.android.navigation.DatabaseQuotes

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface QuoteDao {
    @Query("select * from databasequotes")
    fun getQuotes(): LiveData<List<DatabaseQuotes>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg quotes: DatabaseQuotes)
}

@Database(entities = [DatabaseQuotes::class], version = 1)
abstract class QuotesDatabase : RoomDatabase() {
    abstract val quoteDao: QuoteDao
}

private lateinit var INSTANCE: QuotesDatabase

fun getDatabase(context: Context): QuotesDatabase {
    synchronized(QuotesDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                    QuotesDatabase::class.java,
                    "quotes").build()
        }
    }
    return INSTANCE
}
