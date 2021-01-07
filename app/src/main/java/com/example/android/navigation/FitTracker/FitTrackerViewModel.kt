//
//
//package com.example.android.navigation.FitTracker
//
//import android.app.Application
//import androidx.lifecycle.AndroidViewModel
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.Transformations
//import com.example.android.navigation.Database.FitTijd
//import com.example.android.navigation.Database.FitTijdDAO
//import com.example.android.navigation.Util.formatNights
////import com.example.android.navigation.Util.formatNights
//import kotlinx.coroutines.*
//
///**
// * ViewModel for SleepTrackerFragment.
// */
//class FitTrackerViewModel(
//        val database: FitTijdDAO,
//        application: Application) : AndroidViewModel(application) {
//
//    private var viewModelJob = Job()
//
//    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
//
//    private var training = MutableLiveData<FitTijd?>()
//
//    private val sessie = database.getAllSessions()
//
//    val TrainingString = Transformations.map(sessie) { sessie ->
//      formatNights(sessie, application.resources)
//    }
//
//    init {
//        initializeTraining()
//    }
//
//    private fun initializeTraining() {
//        uiScope.launch {
//            training.value = getTonightFromDatabase()
//        }
//    }
//
//    private suspend fun getTonightFromDatabase(): FitTijd? {
//        return withContext(Dispatchers.IO) {
//            var sessie = database.getTonight()
//            if (sessie?.endTimeMilli != sessie?.startTimeMilli) {
//                sessie = null
//            }
//            sessie
//        }
//    }
//
//    fun onStartTracking() {
//        uiScope.launch {
//            val newNight = FitTijd()
//            insert(newNight)
//            training.value = getTonightFromDatabase()
//        }
//    }
//
//
//
//
//    fun onStopTracking() {
//        uiScope.launch {
//            val oldNight = training.value ?: return@launch
//
//            oldNight.endTimeMilli = System.currentTimeMillis()
//
//            update(oldNight)
//        }
//    }
//
//    private suspend fun insert(night: FitTijd) {
//        withContext(Dispatchers.IO) {
//            database.insert(night)
//        }
//    }
//
//    private suspend fun update(night: FitTijd) {
//        withContext(Dispatchers.IO) {
//            database.update(night)
//        }
//    }
//
//
//
//    override fun onCleared() {
//        super.onCleared()
//        viewModelJob.cancel()
//    }
//}
//
//
