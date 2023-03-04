package com.pallavi.mvvm_activity

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pallavi.mvvm_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

lateinit var viewModel: ActivityViewModel
var i=0
    private var TAG="MVVMactivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ActivityViewModel=
    }
}