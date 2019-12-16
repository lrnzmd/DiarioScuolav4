package com.example.diarioscuolav4.lezioni.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface LezioniDao {
    @Query("SELECT * from lezioni_table ORDER BY orario_info")
    suspend fun getMaterie(): List<Lezioni>

    @Insert(onConflict =  OnConflictStrategy.IGNORE )
    suspend fun insert(lezioni: Lezioni)


    @Query("DELETE FROM lezioni_table")
    suspend fun deleteLezione()

}