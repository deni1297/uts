package com.example.acer.deniuts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExplisit.setOnClickListener{
            val intent = Intent(this,Explicit::class.java)
            startActivity(intent)
        }
        btnImplisit.setOnClickListener {
            startActivity(Intent(this,Implisit::class.java))
        }

        btnIntentbundle.setOnClickListener {
            val intent: Intent = Intent(this,Intentbundle::class.java)
            intent.putExtra("NAMAKU", "DENI ACHMAD")
            intent.putExtra("SEKOLAHKU", "UNIVERSITAS PGRI SEMARANG")
            intent.putExtra("NPM", "16670090")
            startActivity(intent)
        }

    }
    }

