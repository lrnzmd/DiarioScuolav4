package com.example.diarioscuolav4.calendario.db_calendario

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "compiti_table")
data class Compiti(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "title")
    var materia: String?,
    @ColumnInfo(name = "content")
    var content: String?,
    @ColumnInfo(name = "data")
    var data : String?
    )