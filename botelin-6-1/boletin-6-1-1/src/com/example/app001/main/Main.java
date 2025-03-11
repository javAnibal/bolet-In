package com.example.app001.main;

import com.example.app001.models.Alumno;
import com.example.app001.models.Equipo;
import com.example.app001.utils.EquipoException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        try {
            // Crear equipo
            Equipo equipo = new Equipo("Equipo A", new ArrayList<>());

            // Crear alumnos
            Alumno juan = new Alumno("Juan", "12345");
            Alumno maria = new Alumno("Maria", "67890");
            Alumno pedro = new Alumno("Pedro", "11223");

            // Agregar alumnos al equipo
            equipo.agregarAlumno(juan);
            equipo.agregarAlumno(maria);

            // Verificando si PEDRO pertenecen al equipo
            equipo.perteneceAlEquipo(maria); // → salta la exception

        } catch (EquipoException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

