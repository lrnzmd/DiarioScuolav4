package com.example.diarioscuolav4.calendario.db_calendario

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Compiti::class), version = 1, exportSchema = false)
abstract class CompitiRoomDataBase : RoomDatabase(){
            abstract fun compitiDao () : CompitiDao

        companion object{
            @Volatile
            private var INSTANCE : CompitiRoomDataBase? = null

            fun getDatabase(context : Context) : CompitiRoomDataBase(
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                   CompitiRoomDataBase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                return instance
            )
        }

}