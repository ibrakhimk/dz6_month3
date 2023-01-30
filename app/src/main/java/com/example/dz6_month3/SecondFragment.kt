package com.example.dz6_month3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz6_month3.databinding.FragmentSecondBinding
import java.text.FieldPosition

class SecondFragment : Fragment() {
    private var bundle= Bundle()
    private lateinit var binding: FragmentSecondBinding;
    private lateinit var adapter: MusicAdapter
    private var fragment:ThirdFragment=ThirdFragment()

    private val musicList = ArrayList<Music>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = MusicAdapter(musicList,this :: onclick)
        binding.recyclerView.adapter = adapter
    }
    fun onclick(position: Int){
        bundle.putSerializable("key",musicList)
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, fragment).addToBackStack(null).commit()
    }

    private fun loadData() {
        musicList.apply {
            add(Music("1","love me","Me","03:22"))
            add(Music("2","love","Me","03:22"))
            add(Music("3","Me","Love","03:22"))
            add(Music("4","King","country","03:22"))
            add(Music())
            add(Music())
            add(Music())
        }
    }
}
//private lateinit var binding: FragmentSecondBinding
//private val musicList = ArrayList<Music>()
//
//override fun onCreateView(
//    inflater: LayoutInflater, container: ViewGroup?,
//    savedInstanceState: Bundle?
//): View? {
//    binding = FragmentSecondBinding.inflate(inflater)
//    return binding.root
//}
//
//override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//    super.onViewCreated(view, savedInstanceState)
//    loadData()
//    val adapter = MusicAdapter(musicList,this)
//    binding.recyclerView.adapter = adapter
//
//}