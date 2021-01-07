/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.navigation.Model.Quotes
import com.example.android.navigation.viewModels.ViewModels
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HelpFragment : Fragment() {

    private val viewModel: ViewModel by lazy {
        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onViewCreated()"
        }

        ViewModelProvider(this, ViewModels.Factory(activity.application)).get(ViewModels::class.java)

    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment




        val binding: com.example.android.navigation.databinding.FragmentHelpBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_help, container, false)

        val retrofit = Retrofit.Builder()
                .baseUrl("https://type.fit/api/").
                addConverterFactory(GsonConverterFactory.create()).build()

        val api = retrofit.create(APIService::class.java)


            binding.button.setOnClickListener {
                val rnds = (0..100).random()
                api.FetchALLQuotes().enqueue(object : Callback<List<Quotes>> {
                    override fun onResponse(call: Call<List<Quotes>>, response: Response<List<Quotes>>) {

                        Toast.makeText(context, response.body()!![rnds].text, Toast.LENGTH_LONG).show()
                        d("daniel", "onresponse${response.body()!![1].text}")

                    }

                    override fun onFailure(call: Call<List<Quotes>>, t: Throwable) {
                        Toast.makeText(context, "Error something went wrong", Toast.LENGTH_LONG).show()
                        d("daniel", "Onfailure")
                    }



                })


            }





        //val binding: HelpFragment = DataBindingUtil.inflate(inflater, R.layout.fragment_help, container, false)

return binding.root

    }
}
