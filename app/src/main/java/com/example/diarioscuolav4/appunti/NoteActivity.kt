package com.example.diarioscuolav4.appunti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.R
import com.example.diarioscuolav4.appunti.db.Note
import com.google.android.material.floatingactionbutton.FloatingActionButton

import kotlinx.android.synthetic.main.activity_note.*

class NoteActivity : AppCompatActivity() {

    private lateinit var noteViewModel: NoteViewModel
    private val newNoteRequestCode = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        noteViewModel = ViewModelProvider(this).get(NoteViewModel::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = NoteAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        noteViewModel.allNotes.observe(this, Observer { notes ->
            notes?.let { adapter.setNotes(it) }
        })

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            val intent = Intent(this@NoteActivity, AddNote::class.java)
            startActivityForResult(intent, newNoteRequestCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == newNoteRequestCode  && resultCode == Activity.RESULT_OK){
            data?.getStringExtra(AddNote.EXTRA_REPLY)?.let {
                val note = Note(it)
                noteViewModel.insert(note)
            }
        }  else {
            Toast.makeText(applicationContext, "Note not saved", Toast.LENGTH_LONG).show()
        }
    }

}
