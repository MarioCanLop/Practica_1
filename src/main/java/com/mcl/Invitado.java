package com.mcl;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){ //creador del invitado
        this.nombre=nombre;
        this.profesion=profesion;
        this.temporada=temporada;
        setFecha_visita();
    }

    public String getNombre() {
        return nombre;
    } // obtiene el nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // cambia el nombre

    public String getProfesion() {
        return profesion;
    }// obtiene la profesion

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    } // cambia la profesion

    public LocalDate getFecha_visita() {
        return fecha_visita;
    } //obtiene la fecha de la visita

    public void setFecha_visita(){ //da la fecha de la visita
        System.out.println("Dime la fecha de visita aaaa");
        int ano = entrada.nextInt();
        System.out.println("Dime la fecha de visita mm");
        int mes = entrada.nextInt();
        System.out.println("Dime la fecha de visita dd");
        int dia = entrada.nextInt();
        this.fecha_visita = LocalDate.of(ano, mes, dia);
    }

    public int getTemporada() {
        return temporada;
    } //obtiene la temporada en la que va

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    } //cambia la temporada en la que va


    @Override
    public String toString() { //muestra las cosas del invitado
        return "Invitado{" +
                ", nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
