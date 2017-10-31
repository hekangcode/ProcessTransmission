package com.hekang.processtransmission.contentprovider.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by net_c on 2017/7/28.
 */

public class UserProvider extends ContentProvider {

    private SQLiteDatabase db;

    // 创建uri匹配器
    UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    // 在代码块中添加匹配规则
    {
        uriMatcher.addURI("aaaa.bbbbb.UserProvider", "user", 1);
    }

    @Override
    public boolean onCreate() {
        MyOpenHelper myOpenHelper = new MyOpenHelper(getContext());
        db = myOpenHelper.getWritableDatabase();
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable
            String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        Log.i("Mian" , "insert--------------");
        if (uriMatcher.match(uri) == 1) {
            Log.i("Mian" , "insert++++++++++++++++++++");
            db.insert("user", null, values);
        }
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable
            String[] selectionArgs) {
        return 0;
    }
}
