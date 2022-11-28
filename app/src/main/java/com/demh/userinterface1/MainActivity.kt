package com.demh.userinterface1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private  lateinit var editnameperson : EditText
    private  lateinit var editciudad : EditText
    private  lateinit var editPhoneperson : EditText
    private  lateinit var editEmailperson : EditText
    private  lateinit var btn_acces : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editnameperson = findViewById(R.id.editnameperson)
        editciudad = findViewById(R.id.editciudad)
        editPhoneperson = findViewById(R.id.editPhoneperson)
        editEmailperson = findViewById(R.id.editEmailperson)
        btn_acces = findViewById(R.id.btn_acces)

        btn_acces.setOnClickListener {
            startActivity(Intent(this,ActivityMostrar::class.java)
                .putExtra("Nombre Completo",editnameperson.text.toString())
                .putExtra("Ciudad",editciudad.text.toString())
                .putExtra("Telefono",editPhoneperson.text.toString())
                .putExtra("Correo",editEmailperson.text.toString())

            )
        }

    }
}