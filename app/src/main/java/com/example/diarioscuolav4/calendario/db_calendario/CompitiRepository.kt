package com.example.diarioscuolav4.calendario.db_calendario

class CompitiRepository (private val compitiDao: CompitiDao) {

    suspend fun insert(compiti: Compiti){
        compitiDao.insert(compiti)
    }

    suspend fun getCopmiti()= compitiDao.getAll()

}