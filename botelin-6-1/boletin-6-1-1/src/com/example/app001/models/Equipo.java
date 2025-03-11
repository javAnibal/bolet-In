package com.example.app001.models;

import com.example.app001.utils.EquipoException;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEq;
    private List<Alumno> listaAlumnos;

    public Equipo(String nombreEq, List<Alumno> listaAlumnos) {
        this.nombreEq = nombreEq;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombreEq() {
        return nombreEq;
    }

    public void setNombreEq(String nombreEq) {
        this.nombreEq = nombreEq;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEq='" + nombreEq + '\'' +
                ", listaAlumnos=" + listaAlumnos +
                '}';
    }


    //M() añadir alumno

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

    public void eliminarAlumno(Alumno alumno) throws EquipoException {

        if (!listaAlumnos.removeIf(alumnos -> alumnos.getNombre().equalsIgnoreCase(alumno.getNombre()))) {
            throw new EquipoException("El alumno no se encuentra en la lista");
        }
    }


    public void perteneceAlEquipo(Alumno alumno) throws EquipoException { //buscarAlumno

        for (Alumno alumnos : listaAlumnos) {
            if (alumnos.getNombre().equalsIgnoreCase(alumno.getNombre())) {
                return;
            }
        }
        throw new EquipoException("El alumno no esta en el equipo");

    }

    public void mostrarListaEquipo() {

        System.out.println("Lista Equipo");

        listaAlumnos.forEach(alumno -> System.out.println(alumno));

    }

    public void unionEquipos() {
    }


}
