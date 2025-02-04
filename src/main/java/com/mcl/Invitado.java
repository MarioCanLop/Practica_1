package com.mcl;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre=nombre;
        this.profesion=profesion;
        this.temporada=temporada;
        fecha_visita = setFecha_visita();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(){
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
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
