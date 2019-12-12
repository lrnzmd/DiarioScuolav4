package com.example.diarioscuolav4.appunti.db;

import java.lang.System;

@androidx.room.Entity(tableName = "note_table")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/diarioscuolav4/appunti/db/Note;", "", "note", "", "(Ljava/lang/String;)V", "getNote", "()Ljava/lang/String;", "app_debug"})
public final class Note {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "note")
    @androidx.room.PrimaryKey()
    private final java.lang.String note = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    java.lang.String note) {
        super();
    }
}