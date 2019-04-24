package com.example.acer.deniuts

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.intent_bundle.*

class Intentbundle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intent_bundle)

        val nama = intent.getStringExtra("Deni Achmad")
        val npm = intent.getStringExtra("16670090")
        val Universitas = intent.getStringExtra("UNIVERSITAS PGRI SEMARANG")

        Nama.text = nama
        NPM.text = npm
        universitas.text = Universitas

    }
}