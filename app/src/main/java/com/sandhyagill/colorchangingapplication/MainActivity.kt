package com.sandhyagill.colorchangingapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.sandhyagill.colorchangingapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var colorViewModel: ColorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        colorViewModel = ViewModelProvider(this)[ColorViewModel::class.java]
        binding.activity = this
        /* binding.btnRed.setOnClickListener {
            colorViewModel.color.setValue(1)
        }
        binding.btnBlue.setOnClickListener {
            colorViewModel.color.setValue(2)
        }
        binding.btnGreen.setOnClickListener {
            colorViewModel.color.setValue(3)
        }*/
    }

    fun buttonClicked(value : Int){
        colorViewModel.color.setValue(value)
    }
}