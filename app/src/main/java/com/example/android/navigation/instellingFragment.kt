package com.example.android.navigation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.load.model.ModelLoader
import com.example.android.navigation.databinding.FragmentHelpBinding
import com.example.android.navigation.databinding.FragmentInstellingBinding
import kotlinx.android.synthetic.main.fragment_instelling.*


class instellingFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstellingBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_instelling, container, false)

//loadData()
//
//        binding.btnSave.setOnClickListener {
//            saveData()
//        }
//        binding.tvText

        return binding.root
    }
//    private fun saveData() {
//        val insertedText = text.text.toString()
//        tv_text.text = insertedText
//
//
//        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
//        val editor: sharedPreferences.editor = sharedPreferences.edit()
//        editor.apply{
//            Toast.makeText(this,"data saved",Toast.LENGTH_SHORT).show()
//        }
//        private fun loadData(){
//            val sharedPreferences = getSharedprefrences
//        }
//    }


}