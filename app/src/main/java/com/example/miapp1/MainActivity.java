package com.example.miapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<persona> listaPer=new ArrayList<>();
    PersonaDao daoPer=new PersonaDao(this);
    ListView lstPer;
    persona p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daoPer.openBD();
        asignarReferencias();
        insertarpersona();
        listarPersonas();
    }

    private void asignarReferencias() {
        lstPer=findViewById(R.id.lstPer);
    }


    private void listarPersonas() {
        listaPer=daoPer.getPersonas();
        ArrayList<String> lista=new ArrayList<>();
        for(persona per:listaPer){
            lista.add(per.getId()+" "+per.getUsu()+" "+per.getPass());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,lista);
        lstPer.setAdapter(adapter);
    }

    private void insertarpersona() {
        p=new persona("usuario1","pass1");
        daoPer.registrarpesona(p);
        p=new persona("usuario2","pass2");
        daoPer.registrarpesona(p);
        p=new persona("usuario3","pass3");
        daoPer.registrarpesona(p);
        p=new persona("usuario4","pass4");
        daoPer.registrarpesona(p);


    }



}