package com.example.diarioscuolav4.appunti;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\u000eH\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/diarioscuolav4/appunti/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allNotes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/diarioscuolav4/appunti/db/Note;", "getAllNotes", "()Landroidx/lifecycle/MutableLiveData;", "repository", "Lcom/example/diarioscuolav4/appunti/db/NoteRepository;", "insert", "Lkotlinx/coroutines/Job;", "note", "updateNote", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.diarioscuolav4.appunti.db.NoteRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.diarioscuolav4.appunti.db.Note>> allNotes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.diarioscuolav4.appunti.db.Note>> getAllNotes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job updateNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insert(@org.jetbrains.annotations.NotNull()
    com.example.diarioscuolav4.appunti.db.Note note) {
        return null;
    }
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}