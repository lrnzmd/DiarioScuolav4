package com.example.diarioscuolav4.appunti


import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.diarioscuolav4.R


class AddNote : AppCompatActivity () {

    private lateinit var editNote : EditText

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnote)
        editNote = findViewById(R.id.button_save)
    }

    val button = findViewById<Button>(R.id.button_save)
}
