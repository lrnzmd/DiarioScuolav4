package com.example.diarioscuolav4.lezioni.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Lezioni::class), version =  1, exportSchema = false)
abstract class LezioniRoomDataBase : RoomDatabase(){

    abstract fun lezioniDao() : LezioniDao

    companion object {
        @Volatile
        private var INSTANCE: LezioniRoomDataBase? = null

        fun getDatabase(context: Context): LezioniRoomDataBase { val tempInstance = INSTANCE
            if (tempInstance != null) { return tempInstance }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LezioniRoomDataBase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }


}