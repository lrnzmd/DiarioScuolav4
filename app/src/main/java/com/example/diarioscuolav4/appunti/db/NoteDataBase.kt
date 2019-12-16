package com.example.diarioscuolav4.appunti.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



@Database (entities =  arrayOf(Note::class), version = 1, exportSchema = false)
public abstract class NoteRoomDataBase : RoomDatabase(){

    abstract fun noteDao(): NoteDao

    companion object {

        @Volatile
        private var INSTANCE: NoteRoomDataBase? = null

        fun getDatabase(context: Context): NoteRoomDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteRoomDataBase::class.java,
                    "note_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

