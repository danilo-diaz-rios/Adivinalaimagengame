package com.example.daniloenriquediazrios.adivinalaimagengame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jugar.setOnClickListener{

            val boton_jugar = Intent(this,jugar::class.java)
            startActivity(boton_jugar)


        }

        button_ayuda.setOnClickListener{

            val boton_ayuda = Intent( this,Ayuda::class.java)
            startActivity(boton_ayuda)
        }


        button_acerca.setOnClickListener{

            val boton_acerca = Intent( this,Acerca::class.java)
            startActivity(boton_acerca)
        }
    }



}
