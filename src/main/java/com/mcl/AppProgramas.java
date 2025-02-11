package com.mcl;

public class AppProgramas {
    public static void main(String[] args) {
        //creamos una cadena de
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

//        //creamos un programa
        Empleado Director1 = new Empleado("Director1","director");
        System.out.println(Director1);
        Empleado Empleado1 = new Empleado("Pablo Motos","presentador");
        System.out.println(Empleado1);

        //creamos Invitado
        Invitado Invitado1 = new Invitado("Aitana", "cantante", 1);
        System.out.println(Invitado1);

        Invitado Invitado2 = new Invitado("Aitana", "cantante", 1);
        System.out.println(Invitado1);

        //Creamos Programa




        Programa el_hormiguero = new Programa("El Hormiguero",antena3);
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        antena3.anadirProgramas(el_hormiguero);
        el_hormiguero.AnadirEmpleado(Director1);
        el_hormiguero.AnadirEmpleado(Empleado1);

        Programa espejoPublico = new Programa("Espejo Publico",antena3);
        System.out.println(espejoPublico);
        System.out.println(antena3);
        antena3.anadirProgramas(espejoPublico);

        espejoPublico.AnadirInvitado(Invitado2);

//
//        //insertamos empleados en el programa
        el_hormiguero.AnadirEmpleado(Empleado1);
        System.out.println(el_hormiguero);
//
//        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
//
//        //insertamos invitados en el programa
        el_hormiguero.AnadirInvitado(Invitado1);
//
//        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

        //Modificar fecha visita
 //       Invitado1.setFecha_visita();
 //       System.out.println(Invitado1);

        //Invitados de una temporada
        el_hormiguero.invitadosTemporada(1);

        //veces invitado

        System.out.println("Han invitado a " + Invitado1.getNombre() +" " + el_hormiguero.vecesInvitado("Aitana")+" veces");

        //Rastrear Invitados

        el_hormiguero.rastreadoInvitado("Aitana");

        //Ha ido el invitado
        if (el_hormiguero.buscarInvitado("Aitana")){
            System.out.println("El invitado ha ido");
        }else
            System.out.println("El invitado no ha ido");


        //Invitado Antes

        InvitadoAntes("Aitana", el_hormiguero, espejoPublico);



    }
    public static void InvitadoAntes(String nombre, Programa programa1, Programa programa2){

        if (programa1.buscarInvitado(nombre) && programa2.buscarInvitado(nombre)){
           Invitado invitadopro1= programa1.primerPrograma(nombre);
           Invitado invitadopro2= programa2.primerPrograma(nombre);

           if (invitadopro1.getFecha_visita().isBefore(invitadopro2.getFecha_visita())){
               System.out.println("Ha ido antes a " + programa1.getNombre());
           }else if (invitadopro1.getFecha_visita().isAfter(invitadopro2.getFecha_visita()))  {
               System.out.println("Ha ido antes a" + programa2.getNombre());
           }else {
               System.out.println("Han estado el mismo dia");
           }
        } else
            System.out.println("No ha estado en los 2 programas");

    }
}
