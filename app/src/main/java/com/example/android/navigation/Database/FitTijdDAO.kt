///*
// * Copyright 2018, The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
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