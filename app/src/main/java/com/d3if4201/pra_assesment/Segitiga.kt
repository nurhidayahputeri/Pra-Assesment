package com.d3if4201.pra_assesment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.segitiga.*
import kotlin.math.sqrt

class Segitiga: Fragment() {
    private lateinit var binding: Segitiga
    private var alas: Double = 0.00
    private var tinggi: Double = 0.00
    private var sisi: Double = 0.00
    private var luas: Double = 0.00
    private var keliling: Double = 0.00

    companion object {
        const val KEY_LUAS = "key_luas"
        const val KEY_KELILING = "key_keliling"
        const val KEY_SISI = "key_sisi"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.segitiga, container, false)
        if (savedInstanceState != null) {
            sisi = sqrt(alas*alas+tinggi*tinggi)
            luas = savedInstanceState.getDouble((KEY_LUAS))
            keliling = savedInstanceState.getDouble(KEY_KELILING)
        }
        binding.btHitungS.setOnClickListener {
            if (savedInstanceState != null)
                Toast.makeText(this.activity)
        }
    }
}