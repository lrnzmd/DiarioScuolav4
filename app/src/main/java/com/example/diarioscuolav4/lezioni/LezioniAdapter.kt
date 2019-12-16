package com.example.diarioscuolav4.lezioni

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.R
import com.example.diarioscuolav4.lezioni.db.Lezioni

class LezioniAdapter(lezioniActivity: LezioniActivity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    private var lezioni = emptyList<Lezioni>()


    override fun getItemCount(): Int = lezioni.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LezioniViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.ora_layout, parent, false))
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val current = lezioni[position]
        holder.textViewMateria.text = current.materiaInfo
        holder.textViewOrario.text = current.orarioInfo


    }

    internal fun setLezioni (lezioni: List<Lezioni>){
        this.lezioni = lezioni
        notifyDataSetChanged()
    }


   inner class  LezioniViewHolder constructor( itemView : View) : RecyclerView.ViewHolder(itemView){
        val textViewMateria = itemView.findViewById(R.id.text_materia) as TextView
        val textViewOrario = itemView.findViewById(R.id.text_orario) as TextView

        }
    }







