package com.example.palvi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toolbar

class MainActivity2 : AppCompatActivity() {
    lateinit var toolbar: Toolbar
}
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        toolbar = findVeiwById(R.id toolbar)
        SetActionBar(toolbar)


    }
}