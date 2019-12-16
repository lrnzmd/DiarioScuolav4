package com.example.diarioscuolav4.calendario

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.R
import com.example.diarioscuolav4.calendario.db_calendario.Compiti
import kotlinx.android.synthetic.main.recyclerview_compito.*

class CalendarioAdapter (calendarioActivity: CalendarioActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var compiti = emptyList<Compiti>()
    override fun getItemCount(): Int = compiti.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CompitiViewModel (
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_compito, parent, false)
            )
    }


        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val current = compiti[position]
            holder.
        }

        inner class CompitiViewModel constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textView_materia = itemView.findViewById<TextView>(R.id.textView_materia)
            val textView_compito = itemView.findViewById<TextView>(R.id.textView_compito)
        }



}


