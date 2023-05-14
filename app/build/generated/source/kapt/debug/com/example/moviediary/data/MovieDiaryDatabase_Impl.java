package com.example.moviediary.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDiaryDatabase_Impl extends MovieDiaryDatabase {
  private volatile FilmDao _filmDao;

  private volatile ProducerDao _producerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `films` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `genre` TEXT NOT NULL, `year_of_issue` INTEGER NOT NULL, `poster` BLOB, `status` TEXT NOT NULL, `rating` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `producers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `film_id` INTEGER NOT NULL, FOREIGN KEY(`film_id`) REFERENCES `films`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ffa5be3b42305d34ff495484792b36b5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `films`");
        _db.execSQL("DROP TABLE IF EXISTS `producers`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFilms = new HashMap<String, TableInfo.Column>(7);
        _columnsFilms.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("genre", new TableInfo.Column("genre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("year_of_issue", new TableInfo.Column("year_of_issue", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("poster", new TableInfo.Column("poster", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFilms.put("rating", new TableInfo.Column("rating", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFilms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFilms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFilms = new TableInfo("films", _columnsFilms, _foreignKeysFilms, _indicesFilms);
        final TableInfo _existingFilms = TableInfo.read(_db, "films");
        if (! _infoFilms.equals(_existingFilms)) {
          return new RoomOpenHelper.ValidationResult(false, "films(com.example.moviediary.data.Film).\n"
                  + " Expected:\n" + _infoFilms + "\n"
                  + " Found:\n" + _existingFilms);
        }
        final HashMap<String, TableInfo.Column> _columnsProducers = new HashMap<String, TableInfo.Column>(3);
        _columnsProducers.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducers.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducers.put("film_id", new TableInfo.Column("film_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProducers = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysProducers.add(new TableInfo.ForeignKey("films", "CASCADE", "NO ACTION",Arrays.asList("film_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesProducers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProducers = new TableInfo("producers", _columnsProducers, _foreignKeysProducers, _indicesProducers);
        final TableInfo _existingProducers = TableInfo.read(_db, "producers");
        if (! _infoProducers.equals(_existingProducers)) {
          return new RoomOpenHelper.ValidationResult(false, "producers(com.example.moviediary.data.Producer).\n"
                  + " Expected:\n" + _infoProducers + "\n"
                  + " Found:\n" + _existingProducers);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ffa5be3b42305d34ff495484792b36b5", "a5d5d6c668b39148b3f6a8cb1961dc74");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "films","producers");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `films`");
      _db.execSQL("DELETE FROM `producers`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FilmDao filmDao() {
    if (_filmDao != null) {
      return _filmDao;
    } else {
      synchronized(this) {
        if(_filmDao == null) {
          _filmDao = new FilmDao_Impl(this);
        }
        return _filmDao;
      }
    }
  }

  @Override
  public ProducerDao producerDao() {
    if (_producerDao != null) {
      return _producerDao;
    } else {
      synchronized(this) {
        if(_producerDao == null) {
          _producerDao = new ProducerDao_Impl(this);
        }
        return _producerDao;
      }
    }
  }
}
