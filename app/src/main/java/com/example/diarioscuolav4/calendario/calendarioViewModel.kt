package com.example.diarioscuolav4.calendario

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.diarioscuolav4.calendario.db_calendario.CompitiRepository
import com.example.diarioscuolav4.calendario.db_calendario.CompitiRoomDataBase
import com.example.diarioscuolav4.calendario.db_calendario.Compiti

class calendarioViewModel (application : Application) : AndroidViewModel(application){
        private val repository : CompitiRepository
        val allCompiti : MutableLiveData<List<Compiti>> = MutableLiveData()

    init {
        val compitiDao = CompitiRoomDataBase.getDatabase(application).compitiDao()
        repository = CompitiRepository(compitiDao)

    }
}
