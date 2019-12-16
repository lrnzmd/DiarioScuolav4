package com.example.diarioscuolav4.lezioni

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.diarioscuolav4.lezioni.db.Lezioni
import com.example.diarioscuolav4.lezioni.db.LezioniRepository
import com.example.diarioscuolav4.lezioni.db.LezioniRoomDataBase
import kotlinx.coroutines.launch

class LezioniViewModel (application: Application) : AndroidViewModel (application){

    private val repository : LezioniRepository

    val allMaterie: MutableLiveData<List<Lezioni>> = MutableLiveData()


    init {
        val lezioniDao = LezioniRoomDataBase.getDatabase(application).lezioniDao()
        repository = LezioniRepository(lezioniDao)
        updateLezioni()
    }

    private fun updateLezioni()= viewModelScope.launch{
        allMaterie.postValue(repository.getLezioni())
        }

    fun insert (lezioni: Lezioni) =
        viewModelScope.launch {
            repository.insert(lezioni)
            updateLezioni()
        }


}