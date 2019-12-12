package com.example.diarioscuolav4.lezioni.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity( tableName = "lezioni_table")
data class Lezioni (
    @PrimaryKey
    @ColumnInfo(name = "materia_info")
    var materiaInfo: String,
    @ColumnInfo(name="orario_info")
    var orarioInfo : String

    )