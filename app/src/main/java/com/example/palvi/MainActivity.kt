package com.example.palvi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etage:EditText
    lateinit var etheight:EditText
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etname = findViewById(R.id.name)
        etage = findViewById(R.id.age)
        etheight = findViewById(R.id.height)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            if(etname.text.toString().isNullOrEmpty())
                etname.error="Enter your name"
            else if (etage.text.toString().isNullOrEmpty())
                etage.error="Enter your age"
            else if (etheight.text.toString().isNullOrEmpty())
                etheight="Enter yor height"
            else
            Toast.makeText("this",text="validation complete"
                    Toast.LENGTH_SHORT).show(){
              string name = name.gettext().tostring()
              string age = age.gettext().tostring()
              
            }

        }

    }

}
