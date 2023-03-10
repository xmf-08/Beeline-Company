package com.example.beelinecompany

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.beelinecompany.databinding.FragmentMenuBinding

class Menu : Fragment() {
    private lateinit var binding:FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater)

        binding.apply {

            cardTariflar.setOnClickListener {
                findNavControl(0)
            }
            cardDaqiqalar.setOnClickListener {
                findNavControl(1)
            }
            cardInternet.setOnClickListener {
                findNavControl(2)
            }
            cardXizmatlar.setOnClickListener {
                findNavControl(3)
            }
            cardSms.setOnClickListener {
                findNavControl(4)
            }
            cardYangiliklar.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://beeline.uz/b2b/uz/events/news#all")))
            }
        }
        return binding.root
    }
    private fun findNavControl(code:Int){
        findNavController().navigate(R.id.listFragment, bundleOf("key" to code))
    }
}