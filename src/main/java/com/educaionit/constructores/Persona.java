package com.educaionit.constructores;

public class Persona {
    private String nombreApellido;
    private Integer edad;
    private Integer nroDocumento;


    public Persona(){
        //constructor por defecto
    }

    public Persona(String nombreApellido){
        this.nombreApellido = nombreApellido;
    }

    public Persona(String nombreApellido, Integer edad){
        // si no se utiliza this no asigna el valor al atributo porque ambos se llaman edad
        this.nombreApellido = nombreApellido;
        edad = edad;
    }

    public Persona(String nombreApellido, Integer edadParaCargar, Integer nroDocumento){
        //en este caso si lo asigna (sin el this) porque tienen nombres diferentes
        this.nombreApellido = nombreApellido;
        edad = edadParaCargar;
        this.nroDocumento = nroDocumento;
    }

    //no tienee getter ni setter no se puede acceder a lo s atributos
}
