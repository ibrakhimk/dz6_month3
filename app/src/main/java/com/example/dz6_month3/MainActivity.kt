package com.example.dz6_month3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().
        replace(R.id.container_first, FirstFragment()).commit()

        supportFragmentManager.beginTransaction()
        .replace(R.id.container, SecondFragment()).commit()
    }

}