package com.example.diarioscuolav4.appunti

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.diarioscuolav4.appunti.db.Note
import com.example.diarioscuolav4.appunti.db.NoteRepository
import com.example.diarioscuolav4.appunti.db.NoteRoomDataBase
import kotlinx.coroutines.launch

class NoteViewModel (application: Application) : AndroidViewModel(application){

    private val repository : NoteRepository

    val allNotes : MutableLiveData<List<Note>> = MutableLiveData()

    init {
        // Gets reference to WordDao from WordRoomDatabase to construct
        // the correct WordRepository.
        val noteDao = NoteRoomDataBase.getDatabase(application).noteDao()
        repository = NoteRepository(noteDao)
        updateNote()
    }
    private fun updateNote()= viewModelScope.launch {
        allNotes.postValue(repository.getNote())
    }

    fun insert(note: Note)=
        viewModelScope.launch {
            repository.insert(note)
                updateNote()

        }

}