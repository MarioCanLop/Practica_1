package com.mcl;

import java.util.ArrayList;

public class Programa {

    public static int temporadas = 0;

    private String nombre;
    private Cadena cadena;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, Empleado director){
        this.nombre=nombre;
        this.cadena=cadena;
        this.director=director;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        AnadirEmpleado(director);
    }

    public void AnadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    public void EliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
}
