package com.example.diarioscuolav4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.diarioscuolav4.appunti.NoteActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button3 = findViewById(R.id.button3) as Button
        button3.setOnClickListener {val intent = Intent(this, NoteActivity::class.java)
            startActivity(intent)
        }

    }




}
