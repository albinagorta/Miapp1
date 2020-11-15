package com.example.miapp1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class PersonaDao {
    BDpersona bdusuario;
    SQLiteDatabase database;

    public PersonaDao(Context c) {
        bdusuario=new BDpersona(c);
    }
    public  void openBD(){
        database=bdusuario.getWritableDatabase();
    }
    public  void closeBD(){
        bdusuario.close();
        database.close();
    }
    public  void registrarpesona(persona u){
        try{
            ContentValues values=new ContentValues();
            values.put("usu",u.getUsu());
            values.put("pass",u.getPass());
            database.insert(ConstantesBD.NOMBRETABLA,null,values);
        }catch (Exception e){

        }
    }



    public ArrayList<persona> getPersonas(){
        ArrayList<persona> listaPer=new ArrayList<>();
        try {
            Cursor c=database.rawQuery("SELECT * FROM "+ConstantesBD.NOMBRETABLA,
                    null);
            while (c.moveToNext()){
                //public Persona(int id, int dni, String ape, String nom, String email) {
                listaPer.add(new persona(c.getInt(0), c.getString(1),
                        c.getString(2)));
            }

        }catch (Exception e){
            return  null;
        }
        return listaPer;
    }
}
