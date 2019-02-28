package com.favio.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.favio.listview.adaptadores.adaptadorPersona;
import com.favio.listview.modelos.Persona;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ListView lv_listaDias;

    ListView lv_personas;
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    adaptadorPersona adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_personas=(ListView) findViewById(R.id.lv_personas);

        listaPersonas.add(new Persona(1,"Hugo","masculino",20));
        listaPersonas.add(new Persona(2,"Paula","femenino",25));
        listaPersonas.add(new Persona(3,"Alberto","masculino",18));

        adaptador=new adaptadorPersona(listaPersonas,this);
        lv_personas.setAdapter(adaptador);

        //lv_listaDias=findViewById(R.id.lv_listaDias);

        /*String[] listaString=new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listaString);
        lv_listaDias.setAdapter(arrayAdapter);
        */

    }
}
