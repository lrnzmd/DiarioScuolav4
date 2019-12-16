package com.example.diarioscuolav4.lezioni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.MainActivity
import com.example.diarioscuolav4.R
import kotlinx.android.synthetic.main.lezioni_fragment.*

class LezioniActivity : AppCompatActivity() {

    private lateinit var lezioniViewModel: LezioniViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lezioni)


        lezioniViewModel = ViewModelProvider(this).get(LezioniViewModel::class.java)

        val toolbar  = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
        toolbar.setNavigationOnClickListener{
            startActivity( Intent(applicationContext, MainActivity::class.java))}

        recyclerview_lezioni.layoutManager = LinearLayoutManager(this)
        recyclerview_lezioni.adapter = LezioniAdapter(this)

        val recyclerView =findViewById<RecyclerView>(R.id.recyclerview_lezioni)
        val adapter = LezioniAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)



        lezioniViewModel.allMaterie.observe(this, Observer { lezioni ->
            lezioni?.let { adapter.setLezioni(it) }
        })
    }


}
