package com.example.crudkoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_koi.setOnClickListener{
            val intent = Intent(this, KoiActivity::class.java)
            startActivity(intent)
        }

        btn_user.setOnClickListener{
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)

        }
    }
}