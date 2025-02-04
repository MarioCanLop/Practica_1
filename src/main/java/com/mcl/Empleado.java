package com.mcl;

public class Empleado {

    public static final String id_empleado = "EP";
    public static int cantidadEmpleados = 0;

    private String nombre;
    private String cargo;
    private Empleado director;
    private String id;



    public Empleado(String nombre,String cargo, Empleado director){
        this.nombre=nombre;

        setCargo(cargo);
        setDirector(director);
        cantidadEmpleados++;
        this.id = calcularid();

    }

    private String calcularid(){
        return id_empleado + String.format("%03d",cantidadEmpleados);
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        if (cargo.equals("director")){
            this.director = null;
        }else {
            this.director = director;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador") ) {
            this.cargo=cargo;
        } else  {
            this.cargo="pte";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
