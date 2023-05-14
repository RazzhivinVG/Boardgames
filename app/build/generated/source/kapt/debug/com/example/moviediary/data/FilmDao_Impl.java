package com.example.moviediary.data;

import android.database.Cursor;
import android.graphics.Bitmap;
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
public final class FilmDao_Impl implements FilmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Film> __insertionAdapterOfFilm;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Film> __deletionAdapterOfFilm;

  private final EntityDeletionOrUpdateAdapter<Film> __updateAdapterOfFilm;

  public FilmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFilm = new EntityInsertionAdapter<Film>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `films` (`id`,`name`,`genre`,`year_of_issue`,`poster`,`status`,`rating`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Film value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGenre());
        }
        stmt.bindLong(4, value.getYear_of_issue());
        final byte[] _tmp;
        _tmp = __converters.fromBitmap(value.getPoster());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindBlob(5, _tmp);
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        stmt.bindLong(7, value.getRating());
      }
    };
    this.__deletionAdapterOfFilm = new EntityDeletionOrUpdateAdapter<Film>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `films` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Film value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFilm = new EntityDeletionOrUpdateAdapter<Film>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `films` SET `id` = ?,`name` = ?,`genre` = ?,`year_of_issue` = ?,`poster` = ?,`status` = ?,`rating` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Film value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGenre());
        }
        stmt.bindLong(4, value.getYear_of_issue());
        final byte[] _tmp;
        _tmp = __converters.fromBitmap(value.getPoster());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindBlob(5, _tmp);
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStatus());
        }
        stmt.bindLong(7, value.getRating());
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Film film, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFilm.insert(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Film film, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFilm.handle(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Film film, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFilm.handle(film);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<Film>> getFilmsListByName(final String searchQuery) {
    final String _sql = "SELECT * FROM films WHERE name LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"films"}, new Callable<List<Film>>() {
      @Override
      public List<Film> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfYearOfIssue = CursorUtil.getColumnIndexOrThrow(_cursor, "year_of_issue");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<Film> _result = new ArrayList<Film>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Film _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final long _tmpYear_of_issue;
            _tmpYear_of_issue = _cursor.getLong(_cursorIndexOfYearOfIssue);
            final Bitmap _tmpPoster;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfPoster);
            _tmpPoster = __converters.toBitmap(_tmp);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            _item = new Film(_tmpId,_tmpName,_tmpGenre,_tmpYear_of_issue,_tmpPoster,_tmpStatus,_tmpRating);
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
  public Flow<List<Film>> getFilmsListByYear(final String searchQuery) {
    final String _sql = "SELECT * FROM films WHERE strftime('%Y', year_of_issue) LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"films"}, new Callable<List<Film>>() {
      @Override
      public List<Film> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfYearOfIssue = CursorUtil.getColumnIndexOrThrow(_cursor, "year_of_issue");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<Film> _result = new ArrayList<Film>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Film _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final long _tmpYear_of_issue;
            _tmpYear_of_issue = _cursor.getLong(_cursorIndexOfYearOfIssue);
            final Bitmap _tmpPoster;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfPoster);
            _tmpPoster = __converters.toBitmap(_tmp);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            _item = new Film(_tmpId,_tmpName,_tmpGenre,_tmpYear_of_issue,_tmpPoster,_tmpStatus,_tmpRating);
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
  public Flow<List<Film>> getFilmsListByGenre(final String searchQuery) {
    final String _sql = "SELECT * FROM films WHERE genre LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"films"}, new Callable<List<Film>>() {
      @Override
      public List<Film> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfYearOfIssue = CursorUtil.getColumnIndexOrThrow(_cursor, "year_of_issue");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<Film> _result = new ArrayList<Film>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Film _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final long _tmpYear_of_issue;
            _tmpYear_of_issue = _cursor.getLong(_cursorIndexOfYearOfIssue);
            final Bitmap _tmpPoster;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfPoster);
            _tmpPoster = __converters.toBitmap(_tmp);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            _item = new Film(_tmpId,_tmpName,_tmpGenre,_tmpYear_of_issue,_tmpPoster,_tmpStatus,_tmpRating);
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
  public Flow<List<Film>> getFilmsListByProducer(final String searchQuery) {
    final String _sql = "SELECT * FROM films WHERE id IN (SELECT film_id FROM producers WHERE name LIKE '%' || ? || '%' )";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"films","producers"}, new Callable<List<Film>>() {
      @Override
      public List<Film> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfYearOfIssue = CursorUtil.getColumnIndexOrThrow(_cursor, "year_of_issue");
          final int _cursorIndexOfPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "poster");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final List<Film> _result = new ArrayList<Film>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Film _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final long _tmpYear_of_issue;
            _tmpYear_of_issue = _cursor.getLong(_cursorIndexOfYearOfIssue);
            final Bitmap _tmpPoster;
            final byte[] _tmp;
            _tmp = _cursor.getBlob(_cursorIndexOfPoster);
            _tmpPoster = __converters.toBitmap(_tmp);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            _item = new Film(_tmpId,_tmpName,_tmpGenre,_tmpYear_of_issue,_tmpPoster,_tmpStatus,_tmpRating);
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
  public Flow<List<Film>> getFilmsList(final String searchQuery, final SortOrder sortOrder) {
    return FilmDao.DefaultImpls.getFilmsList(FilmDao_Impl.this, searchQuery, sortOrder);
  }
}
