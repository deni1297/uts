package com.example.acer.deniuts

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.ContactsContract
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.implisit.*

class Implisit : AppCompatActivity() {
    val REQUEST_IMAGE_CAPTURE = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.implisit)


        btnALARM.setOnClickListener {
            messaging()

        }

        fun messaging() {
            val uri = Uri.parse("smsto:08883985692")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("deni ", "halo")
            startActivity(intent)
        }
    }

    private fun messaging() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
