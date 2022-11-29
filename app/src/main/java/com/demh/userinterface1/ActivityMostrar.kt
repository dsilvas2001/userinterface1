package com.demh.userinterface1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMostrar : AppCompatActivity() {

    private lateinit var textcedula : TextView
    private lateinit var txtname : TextView
    private lateinit var textnacimiento : TextView
    private lateinit var textelefono : TextView
    private lateinit var textcorreo : TextView
    private lateinit var textciudad : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)

        textcedula = findViewById(R.id.textcedula)
        txtname = findViewById(R.id.textname)
        textnacimiento = findViewById(R.id.textnacimiento)
        textcorreo = findViewById(R.id.textcorreo)
        textelefono = findViewById(R.id.textelefono)
        textciudad = findViewById(R.id.textciudad)

        val nameperson = intent.getStringExtra("NombreCompleto")
        val cedulaperson = intent.getStringExtra("Cedulauser")
        val nacimientoperson = intent.getStringExtra("DateNacimiento")
        val correoperson = intent.getStringExtra("Correo")
        val city = intent.getStringExtra("Ciudad")
        val phoneperson = intent.getStringExtra("Telefono")

        txtname.text = "Mi Nombre es:  " + nameperson
        textcedula.text = "Número  de ID:  " + cedulaperson
        textcorreo.text = "Correo electrónico:  " + correoperson
        textnacimiento.text = "Fecha de Nacimiento:  " + nacimientoperson
        textelefono.text = "Ciudad: " + city
        textciudad.text = "Telefono: " +phoneperson
    }
}