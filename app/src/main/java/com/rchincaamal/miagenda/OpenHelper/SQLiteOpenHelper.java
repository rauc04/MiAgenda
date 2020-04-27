package com.rchincaamal.miagenda.OpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.rchincaamal.miagenda.utils.Utils;

public class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
    final String CREATE_USER = "CREATE TABLE users (id INTEGER, name TEXT, age INTEGER, phone TEXT)";
    //final String CREATE_ADDRESS = "CREATE TABLE address (id INTEGER, street TEXT, number INTEGER, zip INTEGER)";
    //final String CREATE_USER = Utils.create_user;

    public SQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utils.create_user);
        //db.execSQL(CREATE_ADDRESS);
    }

    @Override
        public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS users");
        //db.execSQL("ALTER TABLE users ADD COLUMN photo2");
        //db.execSQL("DROP TABLE IF EXISTS address");
        onCreate(db);
    }
}
