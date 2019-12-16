package com.example.diarioscuolav4.appunti


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.diarioscuolav4.MainActivity
import com.example.diarioscuolav4.R


class AddNote : AppCompatActivity () {

    private lateinit var editNote : EditText

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnote)
        editNote = findViewById(R.id.button_save)


        val toolbar  = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
        toolbar.setNavigationOnClickListener{
            startActivity( Intent(applicationContext, MainActivity::class.java))}

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editNote.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val note = editNote.text.toString()
                replyIntent.putExtra(EXTRA_REPLY, note)
                setResult(Activity.RESULT_CANCELED, replyIntent)
            }
            finish()
        }
    }

    companion object{
        const val  EXTRA_REPLY ="com.example.android.wordlistsql.REPLY"
    }

}
