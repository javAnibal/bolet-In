package com.example.app003.models;

import com.example.app003.utils.MensajeException;

public class Alumno extends Persona{
    private int edad;
    public Alumno(String nombre, String mensaje, int edad) {
        super(nombre, mensaje);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    @Override
    public void enviarMensaje(Persona persona, String mensaje) throws MensajeException {

        if(persona instanceof Alumno alumno){
            if (alumno.getEdad() <=18){


            }
        }

    }


}
