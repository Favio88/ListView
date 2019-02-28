package com.favio.listview.modelos;

public class Persona {

    private int Id;
    private String Nombre;
    private String Sexo;
    private int Edad;

    public Persona(int id, String nombre, String sexo, int edad){
        this.Id=id;
        this.Nombre=nombre;
        this.Sexo=sexo;
        this.Edad=edad;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getEdad() {
        return Edad;
    }


}
