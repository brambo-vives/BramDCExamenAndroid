//
//
//package com.example.android.navigation.Database
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//@Database(entities = [FitTijd::class], version = 1,  exportSchema = false)
//abstract class FitDatabase : RoomDatabase() {
//
//    abstract val fitDatabaseDao: FitTijdDAO
//
//    companion object  {
//
//        @Volatile
//        private var INSTANCE: FitDatabase? = null
//
//        fun getInstance(context: Context) : FitDatabase {
//            synchronized(this) {
//                var instance = INSTANCE
//
//                if (instance == null) {
//                    instance = Room.databaseBuilder(
//                            context.applicationContext,
//                            FitDatabase::class.java,
//                            "Fit_Database"
//                    )
//                            .fallbackToDestructiveMigration()
//                            .build()
//                    INSTANCE = instance
//                }
//
//                return instance
//            }
//        }
//    }
//
//}