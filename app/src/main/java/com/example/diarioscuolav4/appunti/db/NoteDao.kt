package com.example.diarioscuolav4.appunti.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface NoteDao {
    @Query ("SELECT * from note_table ORDER BY note ASC")
    suspend fun

    @Insert (onConflic = OnConflictStrategy.IGNORE)
    suspend fun insert (note: Note)

    @Query("DELETE FROM note_table")
    suspend fun delete()
}