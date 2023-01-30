package com.example.dz6_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz6_month3.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var dataFromFragment: Music

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromFragment = arguments?.getSerializable("key") as Music

        binding.textView.text = dataFromFragment.country
//        val bundle = Bundle()
//        val item = bundle.getSerializable("item") as Music
//        binding.apply {
//            textView.text = item.country
        }
    }
}