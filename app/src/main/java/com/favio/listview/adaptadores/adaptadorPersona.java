package com.favio.listview.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.favio.listview.R;
import com.favio.listview.modelos.Persona;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class adaptadorPersona extends BaseAdapter {

    ArrayList<Persona> listaPersonas;
    Context c;

    public adaptadorPersona(ArrayList<Persona>listaPersonas, Context c){

        this.listaPersonas=listaPersonas;
        this.c=c;
    };

    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaPersonas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaPersonas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=convertView;

        if(v==null){
            v=LayoutInflater.from(c).inflate(R.layout.layout_persona, null);
        }

        Persona persona=(Persona) listaPersonas.get(position);

        TextView tv_nombre=(TextView) v.findViewById(R.id.tv_nombre);
        tv_nombre.setText(persona.getNombre());

        TextView tv_sexo=(TextView) v.findViewById(R.id.tv_sexo);
        tv_sexo.setText(persona.getSexo());

        TextView tv_edad=(TextView) v.findViewById(R.id.tv_edad);
        tv_edad.setText(String.valueOf(persona.getEdad()));

        return v;
    }
}
