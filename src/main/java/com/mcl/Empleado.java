package com.mcl;

public class Empleado {

    public static final String id_empleado = "EP";
    public static int cantidadEmpleados = 0;

    private String nombre;
    private String cargo;
    private Empleado director;
    private String id;



    public Empleado(String nombre,String cargo ){ //este es el constructor dond creamos el empleado con lo que nos da el usuario
        this.nombre=nombre;
        setCargo(cargo);
        setDirector(director);
        cantidadEmpleados++;
        this.id = calcularid();

    }

    private String calcularid(){ //Asignamos automaticamente la id al empleado
        return id_empleado + String.format("%03d",cantidadEmpleados);
    }

    public Empleado getDirector() { //devolvemos quien es el director
        return director;
    }

    public void setDirector(Empleado director) {
        if (cargo.equals("director")){
            this.director = null;
        }else {
            this.director = director;
        }
    } //añadimos el director

    public String getCargo() {
        return cargo;
    } //devolvemos el cargo

    public void setCargo(String cargo) { //damos el cargo comparando si esta con alguno del array y si no lo esta le damos el nombre pte
        String[] cargos = {"director, tecnico, presentador, colaborador"};
         for (int i = 0; i < cargos.length; i++){
            if (cargo.equals(cargos[i])) {
                this.cargo = cargo;
            } else {
                this.cargo = "pte";
            }
        }
    }

    public String getNombre() { //obtenemos el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // cambiamos el nombre - ponemos el nombre
        this.nombre = nombre;
    }

    @Override
    public String toString() { //muesta las cosas del empleado
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                ", id='" + id + '\'' +
                '}';
    }
}
