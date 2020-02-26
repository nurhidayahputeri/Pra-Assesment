package com.d3if4201.pra_assesment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.persegi_panjang.*

class PersegiPanjang: Fragment() {
    private lateinit var binding: PersegiPanjang
    private var panjang: Double = 0.00
    private var lebar: Double = 0.00
    private var luas: Double = 0.00
    private var keliling: Double = 0.00

    companion object {
        const val KEY_LUAS = "key_luas"
        const val KEY_KELILING = "key_keliling"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.persegi_panjang, container, false)
        if (savedInstanceState != null) {
            luas = savedInstanceState.getDouble(KEY_LUAS)
            keliling = savedInstanceState.getDouble(KEY_KELILING)
        }
        binding.btHitung.setOnClickListener {
            if (binding.etPanjang.text.toString().isEmpty() || binding.etLebar.text.toString().isEmpty()) {
                Toast.makeText(this, "Harus Diisi", Toast.LENGTH_SHORT), show()
            } else {
                panjang = binding.etPanjang.text.toString().toDouble()
                lebar = binding.etLebar.text.toString().toDouble()
                keliling = 2 * (panjang + lebar)
                binding.tvHasilP.text = "LUAS" + luas
                binding.tvHasilP.text = "KELILING" + keliling
            }
        }
        binding.btShare.setOnClickListener {
            val luasPersegiPanjang = tvHasilP.text.toString()
            val kelilingPersegiPanjang = tvHasilP.text.toString()
            val  shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, luasPersegiPanjang+"\n"+kelilingPersegiPanjang)
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Hasil Hitung")
            startActivity(Intent.createChooser(shareIntent, "SHARE VIA ..."))
        }
        return binding
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putDouble(KEY_LUAS, luas)
        outState.putDouble(KEY_KELILING, keliling)
    }
    @SuppressLint
    private fun  update(s1: Double, s2: Double) {
        binding.tvHasilP.setText("Luas" +s1.toString())
        binding.tvHasilP.setText("Keliling" +s1.toString())
    }
}