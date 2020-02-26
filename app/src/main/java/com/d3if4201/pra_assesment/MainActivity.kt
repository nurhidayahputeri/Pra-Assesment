package com.d3if4201.pra_assesment

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.d3if4201.pra_assesment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.inflate(inflater, R.layout.activity_main, container,false)



        val navController = this.findNavController(R.id.navigation)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=this.findNavController(R.id.navigation)
        return super.onSupportNavigateUp()
    }
}
