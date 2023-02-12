package com.example.two_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider

open class MainActivity : AppCompatActivity() {
    open lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(false)
                add<FragmentOne>(R.id.fragment_container_view_one)
            }
            supportFragmentManager.commit {
                setReorderingAllowed(false)
                add<FragmentTwo>(R.id.fragment_container_view_two)
            }
        }
    }
}