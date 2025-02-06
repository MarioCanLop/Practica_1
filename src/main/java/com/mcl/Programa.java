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

    public void AnadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    }
    public void EliminarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
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

    public void invitadosTemporada(int temporada){
        System.out.println( "Hay " + listaInvitados.toArray().length + " invitados  ");
        for(Invitado invitado: listaInvitados){
            if (invitado.getTemporada()==temporada) {
                System.out.println("- Nombre Invitado= " + invitado.getNombre() + " Profesion Invitado= " + invitado.getProfesion() );
            }
        }

    }

    public int vecesInvitado(String nombre){
        int cont = 0;
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                cont++;
            }
        }

        return cont;
    }

    public void  rastreadoInvitado(String nombre){
        System.out.println("El invitado " + nombre + " a ido al programa " + vecesInvitado(nombre)+ " veces");
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                System.out.println("Fecha de visita= " +invitado.getFecha_visita() + " Temporada= "+ invitado.getTemporada());
            }
        }
    }

    public boolean buscarInvitado(String nombre){
        boolean asistio = false;
        for (Invitado invitado:listaInvitados){
            if (invitado.getNombre().equals(nombre)){
                asistio= true;
            }
        }

        return asistio ;
    }

    public Invitado primerPrograma(String nombre){
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
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }

}
