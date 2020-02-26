package com.d3if4201.pra_assesment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.d3if4201.pra_assesment.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainFragment: Fragment() {
    private lateinit var binding: FragmentMainBainding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(R.layout.fragment_main, false)
        binding.main = this
        binding.btPersegi.setOnClickListener {
            view?.findNavController()
                ?.navigate(MainFragmentDirections.actionMainFragmentTobtPersegi)
        }
        binding.btSegitiga.setOnClickListener {
            view?.findNavController()
                ?.navigate(MainFragmentDirections.actionMainFragmentTobtSegitiga)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}