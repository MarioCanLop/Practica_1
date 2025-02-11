package com.mcl;

import java.util.ArrayList;

public class Programa {

    public static int temporadas = 0;

    private String nombre;
    private Cadena cadena;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena){ //creador del programa
        this.nombre=nombre;
        this.cadena=cadena;
        this.director=director;
        this.listaEmpleados = new ArrayList<>(); // crea la lista
        this.listaInvitados = new ArrayList<>(); // crea la lista
    }

    public void AnadirEmpleado(Empleado empleado){ //añade empleados
        listaEmpleados.add(empleado);
    }
    public void EliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    } //elimina empleados

    public void AnadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    } //añade invitados
    public void EliminarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    } //elimina invitados



    public String getNombre() {
        return nombre;
    } //obtiene el nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } //cambia el nombre

    public Cadena getCadena() {
        return cadena;
    } // obtiene la cadena

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    } // cambia la cadena

    public int getTemporadas() {
        return temporadas;
    } //obtiene temporadas

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    } //cambia temporadas

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    } //muesetra la lista de empleados

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    } //muestra la lista de invitados

    public Empleado getDirector() {
        return director;
    } //devuelve el director

    public void setDirector(Empleado director) {
        this.director = director;
    } //pone o cambia el director

    public void invitadosTemporada(int temporada){ //muestra los invitados de una temporada en concreto
        System.out.println( "Hay " + listaInvitados.size() + " invitados  ");
        for(Invitado invitado: listaInvitados){
            if (invitado.getTemporada()==temporada) {
                System.out.println("- Nombre Invitado= " + invitado.getNombre() + " Profesion Invitado= " + invitado.getProfesion() );
            }
        }

    }

    public int vecesInvitado(String nombre){ //muestra las veces que ha ido un invitado
        int cont = 0;
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                cont++;
            }
        }

        return cont;
    }

    public void  rastreadoInvitado(String nombre){ //muestra a que programa ha ido el invitado
        System.out.println("El invitado " + nombre + " a ido al programa " + vecesInvitado(nombre)+ " veces");
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println("Fecha de visita= " +invitado.getFecha_visita() + " Temporada= "+ invitado.getTemporada());
            }
        }
    }

    public boolean buscarInvitado(String nombre){  //muestra si el invitado ya ha estado en otro programa
        boolean asistio = false;
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                asistio= true;
            }
        }

        return asistio ;
    }

    public Invitado primerPrograma(String nombre){ //dice a cual programa ha ido ante el invitado
        Invitado invitadoPrimero = null;
        for (Invitado invitado:listaInvitados) {
            if (invitado.getNombre().equals(nombre)){
                if (invitadoPrimero==null) {
                    invitadoPrimero = invitado;
                } else {
                  if (invitadoPrimero.getFecha_visita().isAfter(invitado.getFecha_visita()))
                      invitadoPrimero=invitado;
                }

            }
        }
        return invitadoPrimero;
    }

    @Override
    public String toString() { //muestra las cosas del programa
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }

}
