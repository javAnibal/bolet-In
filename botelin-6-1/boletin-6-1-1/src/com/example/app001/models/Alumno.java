package com.example.app001.models;

import java.util.Objects;

/**
 * The type Alumno.
 */
public class Alumno {
    private String nombre;
    private String dni;


    /**
     * Instantiates a new Alumno.
     *
     * @param nombre the nombre
     * @param dni    the dni
     */
    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets dni.
     *
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Sets dni.
     *
     * @param dni the dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Equals boolean.
     *
     * @param o the o
     * @return the boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(dni, alumno.dni);
    }

    /**
     * Hash code int.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni);
    }

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s | DNI: %s", nombre, dni);
    }
}
