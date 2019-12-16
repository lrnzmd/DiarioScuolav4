package com.example.diarioscuolav4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.diarioscuolav4.appunti.NoteActivity
import com.example.diarioscuolav4.calendario.CalendarioActivity
import com.example.diarioscuolav4.compiti.compiti
import com.example.diarioscuolav4.impostazioni.impostazioni
import com.example.diarioscuolav4.lezioni.LezioniActivity
import com.example.diarioscuolav4.notizie.notizie

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {val intent = Intent(this, LezioniActivity::class.java)
            startActivity(intent) }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {val intent = Intent(this, compiti::class.java)
                startActivity(intent)}

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {val intent = Intent(this, NoteActivity::class.java)
            startActivity(intent)}

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener { val intent = Intent(this, CalendarioActivity::class.java)
                startActivity(intent)}

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener { val intent = Intent(this, notizie::class.java)
                    startActivity(intent)}

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener { val intent = Intent(this, impostazioni::class.java)
            startActivity(intent)}

    }

}