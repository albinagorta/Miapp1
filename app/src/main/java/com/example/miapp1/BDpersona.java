package com.example.miapp1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDpersona extends SQLiteOpenHelper {

    public BDpersona(@Nullable Context context) {
        super(context, ConstantesBD.NOMBREBD, null, ConstantesBD.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE "+ConstantesBD.NOMBRETABLA+" "+
                "(id integer primary key autoincrement,"+
                "usu integer not null,"+
                "pass text not null);");}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
