package com.example.moviediary.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
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
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProducerDao_Impl implements ProducerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Producer> __insertionAdapterOfProducer;

  private final EntityDeletionOrUpdateAdapter<Producer> __deletionAdapterOfProducer;

  private final EntityDeletionOrUpdateAdapter<Producer> __updateAdapterOfProducer;

  public ProducerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProducer = new EntityInsertionAdapter<Producer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `producers` (`id`,`name`,`film_id`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Producer value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getFilm_id());
      }
    };
    this.__deletionAdapterOfProducer = new EntityDeletionOrUpdateAdapter<Producer>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `producers` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Producer value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfProducer = new EntityDeletionOrUpdateAdapter<Producer>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `producers` SET `id` = ?,`name` = ?,`film_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Producer value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getFilm_id());
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Producer producer, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProducer.insert(producer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Producer producer, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProducer.handle(producer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Producer producer, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProducer.handle(producer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<Producer>> getProducersListByFilmId(final int film_id) {
    final String _sql = "SELECT * FROM producers WHERE film_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, film_id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"producers"}, new Callable<List<Producer>>() {
      @Override
      public List<Producer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "film_id");
          final List<Producer> _result = new ArrayList<Producer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Producer _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpFilm_id;
            _tmpFilm_id = _cursor.getInt(_cursorIndexOfFilmId);
            _item = new Producer(_tmpId,_tmpName,_tmpFilm_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Producer>> getProducersList() {
    final String _sql = "SELECT * FROM producers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"producers"}, new Callable<List<Producer>>() {
      @Override
      public List<Producer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFilmId = CursorUtil.getColumnIndexOrThrow(_cursor, "film_id");
          final List<Producer> _result = new ArrayList<Producer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Producer _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpFilm_id;
            _tmpFilm_id = _cursor.getInt(_cursorIndexOfFilmId);
            _item = new Producer(_tmpId,_tmpName,_tmpFilm_id);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
