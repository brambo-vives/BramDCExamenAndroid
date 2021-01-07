//
//
//package com.example.android.navigation.FitTracker
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.databinding.DataBindingUtil
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.ViewModelProviders
//import com.example.android.navigation.Database.FitDatabase
//import com.example.android.navigation.R
//import com.example.android.navigation.databinding.FragmentLogBinding
//
//
//class LogFragment : Fragment() {
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        val binding: FragmentLogBinding = DataBindingUtil.inflate(
//                inflater, R.layout.fragment_log, container, false)
//
//
//        val application = requireNotNull(this.activity).application
//
//        val dataSource = FitDatabase.getInstance(application).fitDatabaseDao
//
//        val viewModelFactory = FitTrackerViewModelFactory(dataSource, application)
//
//        val fitTrackerViewModel =
//                ViewModelProviders.of(this, viewModelFactory).get(FitTrackerViewModel::class.java)
//
//        binding.fitTrackerViewModel = fitTrackerViewModel
//        binding.setLifecycleOwner(this)
//
//
//        return binding.root
//    }
//}
