package com.seoul.app.zeropay_client.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class UserInfoDao_Impl implements UserInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserInfo;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUserInfo;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUserInfo;

  public UserInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfo = new EntityInsertionAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `UserInfo`(`mno`,`id`,`name`,`pwd`,`phone`,`payPwd`,`address`,`email`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getMno());
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPwd() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPwd());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        if (value.getPayPwd() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPayPwd());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAddress());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmail());
        }
      }
    };
    this.__deletionAdapterOfUserInfo = new EntityDeletionOrUpdateAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserInfo` WHERE `mno` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getMno());
      }
    };
    this.__updateAdapterOfUserInfo = new EntityDeletionOrUpdateAdapter<UserInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `UserInfo` SET `mno` = ?,`id` = ?,`name` = ?,`pwd` = ?,`phone` = ?,`payPwd` = ?,`address` = ?,`email` = ? WHERE `mno` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfo value) {
        stmt.bindLong(1, value.getMno());
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPwd() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPwd());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhone());
        }
        if (value.getPayPwd() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPayPwd());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAddress());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmail());
        }
        stmt.bindLong(9, value.getMno());
      }
    };
  }

  @Override
  public void insert(UserInfo userInfo) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserInfo.insert(userInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(UserInfo userInfo) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUserInfo.handle(userInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(UserInfo userInfo) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUserInfo.handle(userInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<UserInfo> getAll() {
    final String _sql = "SELECT * FROM userinfo ORDER BY mno";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<UserInfo>(__db.getQueryExecutor()) {
      private Observer _observer;

      @Override
      protected UserInfo compute() {
        if (_observer == null) {
          _observer = new Observer("userinfo") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfMno = _cursor.getColumnIndexOrThrow("mno");
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPwd = _cursor.getColumnIndexOrThrow("pwd");
          final int _cursorIndexOfPhone = _cursor.getColumnIndexOrThrow("phone");
          final int _cursorIndexOfPayPwd = _cursor.getColumnIndexOrThrow("payPwd");
          final int _cursorIndexOfAddress = _cursor.getColumnIndexOrThrow("address");
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final UserInfo _result;
          if(_cursor.moveToFirst()) {
            final int _tmpMno;
            _tmpMno = _cursor.getInt(_cursorIndexOfMno);
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPwd;
            _tmpPwd = _cursor.getString(_cursorIndexOfPwd);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final String _tmpPayPwd;
            _tmpPayPwd = _cursor.getString(_cursorIndexOfPayPwd);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            _result = new UserInfo(_tmpMno,_tmpId,_tmpName,_tmpPwd,_tmpPhone,_tmpPayPwd,_tmpAddress,_tmpEmail);
          } else {
            _result = null;
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
    }.getLiveData();
  }
}
