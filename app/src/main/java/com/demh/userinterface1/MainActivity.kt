package com.demh.userinterface1

import android.annotation.SuppressLint
import android.app.usage.UsageEvents.Event
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    private  lateinit var editCedula : EditText
    private  lateinit var editnameperson : EditText
    private  lateinit var editTextDate : EditText
    private  lateinit var editciudad : EditText
    private  lateinit var editPhoneperson : EditText
    private  lateinit var editEmailperson : EditText
    private  lateinit var capsulagenero : EditText
    private  lateinit var btn_acces : Button
    private  lateinit var radioGroup : RadioGroup
    private  lateinit var radioButton : RadioButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editCedula = findViewById(R.id.editCedula)
        editnameperson = findViewById(R.id.editnameperson)
        editTextDate = findViewById(R.id.editTextDate)
        editciudad = findViewById(R.id.editciudad)
        editPhoneperson = findViewById(R.id.editPhoneperson)
        editEmailperson = findViewById(R.id.editEmailperson)
        btn_acces = findViewById(R.id.btn_acces)
        radioGroup = findViewById(R.id.radioGroup)





        btn_acces.setOnClickListener {
            startActivity(Intent(this,ActivityMostrar::class.java)
                .putExtra("Cedulauser",editCedula.text.toString())
                .putExtra("NombreCompleto",editnameperson.text.toString())
                .putExtra("DateNacimiento",editTextDate.text.toString())
                .putExtra("Ciudad",editciudad.text.toString())
                .putExtra("Telefono",editPhoneperson.text.toString())
                .putExtra("Correo",editEmailperson.text.toString())
            )
        }
    }

}