package com.example.diarioscuolav4.calendario.db_calendario

import androidx.room.*


@Dao
interface CompitiDao {
    @Query("SELECT * from compiti_table ORDER BY data" )
    suspend fun getAll(): String

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(compito: Compiti)


    @Query("DELETE FROM compiti_table")
    suspend fun deleteCompito (compito : Compiti )

}