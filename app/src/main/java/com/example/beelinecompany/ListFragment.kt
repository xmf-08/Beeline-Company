package com.example.beelinecompany

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.beelinecompany.adapters.RvClick
import com.example.beelinecompany.adapters.TemAdapter
import com.example.beelinecompany.databinding.FragmentListBinding
import com.example.beelinecompany.databinding.ItemRvBinding
import com.example.beelinecompany.models.MyTemplate
import com.example.beelinecompany.utils.MyData

class ListFragment : Fragment(), RvClick {
    lateinit var binding: FragmentListBinding
    lateinit var temAdapter:TemAdapter
    var key = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)

        key = arguments?.getInt("key", 0)!!

        when(key){
            0-> showTemp(MyData.listTerif)
            1-> showTemp(MyData.listDaqiqa)
            2-> showTemp(MyData.listInternet)
            3-> showTemp(MyData.listXizmatlar)
            4-> showTemp(MyData.listSMS)
        }

        return binding.root
    }

    private fun showTemp(list: List<MyTemplate>){
        temAdapter = TemAdapter(list, this)
        binding.rvList.adapter = temAdapter
    }

    override fun itemClick(myTemplate: MyTemplate) {
        findNavController().navigate(R.id.aboutFragment, bundleOf("keyTemp" to myTemplate))
    }
}