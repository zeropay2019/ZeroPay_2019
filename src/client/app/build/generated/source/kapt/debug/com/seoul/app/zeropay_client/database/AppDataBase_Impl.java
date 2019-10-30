package com.seoul.app.zeropay_client.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDataBase_Impl extends AppDataBase {
  private volatile UserInfoDao _userInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserInfo` (`mno` INTEGER NOT NULL, `id` TEXT NOT NULL, `name` TEXT NOT NULL, `pwd` TEXT NOT NULL, `phone` TEXT NOT NULL, `payPwd` TEXT NOT NULL, `address` TEXT, `email` TEXT, PRIMARY KEY(`mno`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"dfe941cdc95fe9d4ebd61b19c860baa6\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `UserInfo`");
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
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserInfo = new HashMap<String, TableInfo.Column>(8);
        _columnsUserInfo.put("mno", new TableInfo.Column("mno", "INTEGER", true, 1));
        _columnsUserInfo.put("id", new TableInfo.Column("id", "TEXT", true, 0));
        _columnsUserInfo.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsUserInfo.put("pwd", new TableInfo.Column("pwd", "TEXT", true, 0));
        _columnsUserInfo.put("phone", new TableInfo.Column("phone", "TEXT", true, 0));
        _columnsUserInfo.put("payPwd", new TableInfo.Column("payPwd", "TEXT", true, 0));
        _columnsUserInfo.put("address", new TableInfo.Column("address", "TEXT", false, 0));
        _columnsUserInfo.put("email", new TableInfo.Column("email", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserInfo = new TableInfo("UserInfo", _columnsUserInfo, _foreignKeysUserInfo, _indicesUserInfo);
        final TableInfo _existingUserInfo = TableInfo.read(_db, "UserInfo");
        if (! _infoUserInfo.equals(_existingUserInfo)) {
          throw new IllegalStateException("Migration didn't properly handle UserInfo(com.seoul.app.zeropay_client.database.UserInfo).\n"
                  + " Expected:\n" + _infoUserInfo + "\n"
                  + " Found:\n" + _existingUserInfo);
        }
      }
    }, "dfe941cdc95fe9d4ebd61b19c860baa6", "9254152a61641ab19f23c2fd48075c75");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "UserInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `UserInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserInfoDao UserInfoDao() {
    if (_userInfoDao != null) {
      return _userInfoDao;
    } else {
      synchronized(this) {
        if(_userInfoDao == null) {
          _userInfoDao = new UserInfoDao_Impl(this);
        }
        return _userInfoDao;
      }
    }
  }
}
