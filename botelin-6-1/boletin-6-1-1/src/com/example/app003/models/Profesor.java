package com.example.app003.models;

import com.example.app003.utils.MensajeException;

public class Profesor extends Persona{
    public Profesor(String nombre, String mensaje) {
        super(nombre, mensaje);
    }

    @Override
    public void enviarMensaje(Persona persona, String mensaje) throws MensajeException {
        if(persona instanceof Alumno alumno){
            if (alumno.getEdad() <=18){

            }
        }
    }
}
