package com.example.diarioscuolav4.appunti

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diarioscuolav4.R
import com.example.diarioscuolav4.appunti.db.Note
import kotlinx.android.synthetic.main.activity_note.view.*

class NoteAdapter internal constructor(
    context: Context
): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>(){

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var notes = emptyList<Note>()

    inner class NoteViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val noteItemView: TextView = itemView.findViewById(R.id.text_view_note)}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = inflater.inflate(R.layout.note_layout, parent, false)
        return NoteViewHolder(itemView) }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val current = notes[position]
        holder.noteItemView.text =current.note
    }

    internal fun setNotes(notes: List<Note>){
        this.notes = notes
        notifyDataSetChanged()
    }

    override fun getItemCount () = notes.size
}