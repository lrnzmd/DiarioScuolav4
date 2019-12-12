package com.example.diarioscuolav4.lezioni

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.R
import com.example.diarioscuolav4.lezioni.db.Lezioni
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.ora_layout.view.*
import kotlin.coroutines.coroutineContext

class LezioniAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    private var lezione = emptyList<Lezioni>()


    override fun getItemCount(): Int = lezione.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return LezioniViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ora_layout, parent, false)
            )
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //val current = lezione[position]

       // holder?.textViewMateria.text = lezioni.materiaInfo
       // holder?.textViewOrario.text = lezioni.orarioInfo


    }

    class  LezioniViewHolder constructor( itemView : View) : RecyclerView.ViewHolder(itemView){
        val textViewMateria : TextView= itemView.findViewById(R.id.text_materia) as TextView
        val textViewOrario : TextView = itemView.findViewById(R.id.text_orario)as TextView

        }
    }







