package com.example.diarioscuolav4.lezioni.db

class LezioniRepository (private val lezioniDao: LezioniDao){

    suspend fun insert (lezioni: Lezioni)
    { lezioniDao.insert(lezioni) }

    suspend fun getLezioni() = lezioniDao.getMaterie()

    suspend fun deletemateria() = lezioniDao.deleteLezione()


}









