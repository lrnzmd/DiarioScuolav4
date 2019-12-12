package com.example.diarioscuolav4.lezioni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diarioscuolav4.R
import kotlinx.android.synthetic.main.activity_calendario.*
import kotlinx.android.synthetic.main.activity_lezioni.*

class LezioniActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lezioni)
        setSupportActionBar(toolbar)

        recyclerview_lezioni.layoutManager = LinearLayoutManager(this)
        recyclerview_lezioni.adapter = LezioniAdapter()
    }
}
