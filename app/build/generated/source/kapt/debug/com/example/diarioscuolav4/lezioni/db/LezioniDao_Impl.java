package com.example.diarioscuolav4.lezioni.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LezioniDao_Impl implements LezioniDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Lezioni> __insertionAdapterOfLezioni;

  private final SharedSQLiteStatement __preparedStmtOfDeleteLezione;

  public LezioniDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLezioni = new EntityInsertionAdapter<Lezioni>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `lezioni_table` (`materia_info`,`orario_info`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Lezioni value) {
        if (value.getMateriaInfo() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMateriaInfo());
        }
        if (value.getOrarioInfo() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOrarioInfo());
        }
      }
    };
    this.__preparedStmtOfDeleteLezione = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM lezioni_table";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Lezioni lezioni, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLezioni.insert(lezioni);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteLezione(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteLezione.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteLezione.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getMaterie(final Continuation<? super List<Lezioni>> p0) {
    final String _sql = "SELECT * from lezioni_table ORDER BY orario_info";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Lezioni>>() {
      @Override
      public List<Lezioni> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMateriaInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "materia_info");
          final int _cursorIndexOfOrarioInfo = CursorUtil.getColumnIndexOrThrow(_cursor, "orario_info");
          final List<Lezioni> _result = new ArrayList<Lezioni>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Lezioni _item;
            final String _tmpMateriaInfo;
            _tmpMateriaInfo = _cursor.getString(_cursorIndexOfMateriaInfo);
            final String _tmpOrarioInfo;
            _tmpOrarioInfo = _cursor.getString(_cursorIndexOfOrarioInfo);
            _item = new Lezioni(_tmpMateriaInfo,_tmpOrarioInfo);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
