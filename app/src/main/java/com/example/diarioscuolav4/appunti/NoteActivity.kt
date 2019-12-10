package com.example.diarioscuolav4.appunti

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.diarioscuolav4.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

import kotlinx.android.synthetic.main.activity_note.*

class NoteActivity : AppCompatActivity() {
    private val addnoteRequestCode = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        setSupportActionBar(toolbar)

        NoteViewModel = ViewModelProvider(this).get(NoteViewModel::class.java)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this@NoteActivity, AddNote::class.java)
            startActivityForResult(intent, addnoteRequestCode)
        }
    }

}
