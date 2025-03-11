package com.example.app001.models;

import com.example.app001.utils.EquipoException;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Equipo.
 */
public class Equipo {
    private String nombreEq;
    private List<Alumno> listaAlumnos;

    /**
     * Instantiates a new Equipo.
     *
     * @param nombreEq     the nombre eq
     * @param listaAlumnos the lista alumnos
     */
    public Equipo(String nombreEq, List<Alumno> listaAlumnos) {
        this.nombreEq = nombreEq;
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Gets nombre eq.
     *
     * @return the nombre eq
     */
    public String getNombreEq() {
        return nombreEq;
    }

    /**
     * Sets nombre eq.
     *
     * @param nombreEq the nombre eq
     */
    public void setNombreEq(String nombreEq) {
        this.nombreEq = nombreEq;
    }

    /**
     * Gets lista alumnos.
     *
     * @return the lista alumnos
     */
    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Sets lista alumnos.
     *
     * @param listaAlumnos the lista alumnos
     */
    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEq='" + nombreEq + '\'' +
                ", listaAlumnos=" + listaAlumnos +
                '}';
    }


    //M() añadir alumno

    /**
     * Agregar alumno.
     *
     * @param alumno the alumno
     * @throws EquipoException the equipo exception
     */
    public void agregarAlumno(Alumno alumno) throws EquipoException {
        if (this.listaAlumnos == null) {
            this.listaAlumnos = new ArrayList<>();
        }

        for (Alumno alumnos : listaAlumnos) {
            if (alumnos.getNombre().equalsIgnoreCase(alumno.getNombre())) {
                throw new EquipoException("El alumno ya se eentra en la lista");
            }
        }

        this.listaAlumnos.add(alumno);
    }


    //M() borrarAlumno

    /**
     * Eliminar alumno.
     *
     * @param alumno the alumno
     * @throws EquipoException the equipo exception
     */
    public void eliminarAlumno(Alumno alumno) throws EquipoException {

        if (!listaAlumnos.removeIf(alumnos -> alumnos.getNombre().equalsIgnoreCase(alumno.getNombre()))) {
            throw new EquipoException("El alumno no se encuentra en la lista");
        }
    }


    /**
     * Pertenece al equipo.
     *
     * @param alumno the alumno
     * @throws EquipoException the equipo exception
     */
    public void perteneceAlEquipo(Alumno alumno) throws EquipoException { //buscarAlumno

        for (Alumno alumnos : listaAlumnos) {
            if (alumnos.getNombre().equalsIgnoreCase(alumno.getNombre())) {
                System.out.println("El alumno " + alumno.getNombre() + " pertenece al equipo " + nombreEq);
                return;
            }
        }
        throw new EquipoException("El alumno no esta en el equipo");

    }

    /**
     * Mostrar lista equipo.
     */
    public void mostrarListaEquipo() {

        System.out.println("Lista Equipo");

        listaAlumnos.forEach(alumno -> System.out.println(alumno));

    }

    /**
     * Union equipos.
     */
    public void unionEquipos(Equipo otroEquipo) {

    }

}
