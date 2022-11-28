package com.demh.userinterface1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMostrar : AppCompatActivity() {

    private lateinit var txtname : TextView
    private lateinit var textelefono : TextView
    private lateinit var textciudad : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        txtname = findViewById(R.id.textname)
        textelefono = findViewById(R.id.textelefono)
        textciudad = findViewById(R.id.textciudad)

        val nameperson = intent.getStringExtra("NombreCompleto")
        val city = intent.getStringExtra("Ciudad")
        val phoneperson = intent.getStringExtra("Telefono")

        txtname.text = "Nombres:  " + nameperson
        textelefono.text = "Ciudad: " + city
        textciudad.text = "Telefono: " +phoneperson
    }
}