
//
//package com.example.android.navigation.Database
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//
//@Dao
//interface FitTijdDAO {
//    @Insert
//    fun insert(sessie: FitTijd)
//
//    @Update
//    fun update(sessie: FitTijd)
//
//    @Query("Delete From FitLogger Where TrainingID = :key")
//    fun delete(key: Long)
//
//    @Query("SELECT * from FitLogger WHERE TrainingID = :key")
//    fun get(key: Long): FitTijd?
//
//
//
//    @Query("SELECT * FROM FitLogger ORDER BY TrainingID DESC")
//    fun getAllSessions(): LiveData<List<FitTijd>>
//
//
//    @Query("SELECT * FROM FitLogger ORDER BY TrainingID DESC LIMIT 1")
//    fun getTonight(): FitTijd?
//
//    @Query("Select COUNT(Tijd) From FitLogger")
//   fun getALLTime(): FitTijd?
//}