package com.example.diarioscuolav4.appunti.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database (entities =  arrayOf(Note::class), version = 1, exportSchema = false)
public abstract class NoteDataBase : RoomDatabase(){
    abstract fun NoteDao(): NoteDao

    @Volatile
    private var INSTANCE: NoteDataBase? = null

    fun getDatabase(context: Context): NoteDataBase {
        val tempInstance = INSTANCE
        if (tempInstance != null) {
            return tempInstance
        }
        synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                NoteDataBase::class.java,
                "word_database"
            ).build()
            INSTANCE = instance
            return instance
        }
    }
}

