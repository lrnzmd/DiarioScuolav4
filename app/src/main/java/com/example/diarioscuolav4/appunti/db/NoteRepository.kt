package com.example.diarioscuolav4.appunti.db

class NoteRepository (private val noteDao: NoteDao){

    suspend fun insert (note: Note){
        noteDao.insert(note) }


}