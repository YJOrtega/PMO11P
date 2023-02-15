package com.example.pmo11p2023.configuracion;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import com.example.pmo11p2023.transacciones.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper
{

    //constructor de clases con parametros

    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, dbname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        // lista de las tablas a crear
        sqLiteDatabase.execSQL(Transacciones.CreateTBPersonas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        // lista que deseamos eliminar
        sqLiteDatabase.execSQL(Transacciones.DropTablePersonas);
    }
}
