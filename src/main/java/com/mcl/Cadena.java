package com.mcl;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas ;

    public Cadena(String nombre){ // es el contructor
        this.nombre= nombre; //creamos con el nombre que nos dan
        this.listaProgramas = new ArrayList<>();  // creamos la lista para que se pueda utilizar
    }

    public String getNombre() {
        return nombre;
    } //obtenemos nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //cambiamos o damos el nombre

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    } //devolvemos la lista de los programas que tiene la cadena

    public void  anadirProgramas(Programa programa) { //añadimos programas a la lista
        listaProgramas.add(programa);
    }
    public void eliminarProgramas(Programa programa) { //eliminamos programas a la lista
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() { //mostramos las cosas de la cadena
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
