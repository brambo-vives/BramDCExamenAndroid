//
//package com.example.android.navigation.FitTracker
//
//import android.app.Application
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.android.navigation.Database.FitTijdDAO
//
//
//class FitTrackerViewModelFactory(
//        private val dataSource: FitTijdDAO,
//        private val application: Application) : ViewModelProvider.Factory {
//
//    @Suppress("unchecked_cast")
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(FitTrackerViewModel::class.java)) {
//            return FitTrackerViewModel(dataSource, application) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//
//}
//
