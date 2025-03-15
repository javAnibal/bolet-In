package com.example.app003.models;

import com.example.app003.utils.MensajeException;

public abstract class Persona {
    protected String nombre;
    protected String mensaje;

    public Persona(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    public abstract void enviarMensaje(Persona persona, String mensaje) throws MensajeException;
}
