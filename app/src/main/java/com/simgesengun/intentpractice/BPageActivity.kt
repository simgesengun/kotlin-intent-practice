package com.simgesengun.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_page.*

class BPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_page)
        bButton.setOnClickListener {
            val intent = Intent(this@BPageActivity,YPageActivity::class.java)
            startActivity(intent)
        }
    }
}