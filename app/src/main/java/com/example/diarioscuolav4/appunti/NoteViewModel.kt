package com.example.diarioscuolav4.appunti

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.diarioscuolav4.appunti.db.Note
import com.example.diarioscuolav4.appunti.db.NoteRepository
import com.example.diarioscuolav4.appunti.db.NoteRoomDataBase

class NoteViewModel (application: Application) : AndroidViewModel(application){

    private val repository : NoteRepository

    val allnote: MutableLiveData<list<Note>> = MutableLiveData()

    init {
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val noteDao = NoteRoomDataBase.getDatabase(application).wordDao()
        repository = NoteRepository(noteDao)
        updateNote()
    }


}