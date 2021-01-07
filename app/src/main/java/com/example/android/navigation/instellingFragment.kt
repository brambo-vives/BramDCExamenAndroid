package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.navigation.databinding.FragmentHelpBinding
import com.example.android.navigation.databinding.FragmentInstellingBinding


class instellingFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstellingBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_instelling, container, false)

        return binding.root
    }
}