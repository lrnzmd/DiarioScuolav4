package com.example.diarioscuolav4.lezioni.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LezioniDao {
    @Query("SELECT * from lezioni_table ORDER BY lezioneId")
    suspend fun getLezioni(): List<Lezioni>



}