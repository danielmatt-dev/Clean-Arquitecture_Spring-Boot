package com.practica.crean.arquitecture.core.domain;

import com.practica.crean.arquitecture.shared.enums.Carrera;

import java.util.Random;

public class Estudiante {

    private String matricula;
    private String nombre;
    private String apellidos;
    private int edad;
    private Carrera carrera;
    private String grupo;

    public Estudiante() {}

    public Estudiante(String matricula, String nombre, String apellidos, int edad, Carrera carrera, String grupo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String generarMatricula() {
        return "S22004" + new Random().nextInt(1000);
    }

    public String asignarGrupo(int semestre){
        if (semestre > 0 && semestre < 9 ){

            if (semestre == 1){
                return "101";
            } else if (semestre == 2){
                return "201";
            } else if (semestre == 3){
                return "301";
            } else if (semestre == 4){
                return "401";
            } else if (semestre == 5){
                return "501";
            } else if (semestre == 6){
                return "601";
            } else if (semestre == 7){
                return "701";
            } else if (semestre == 8){
                return "801";
            }
        } else {
            return "Semestre no existente";
        }
        return "Semestre no válido";
    }

    public String asignarGrupoDos(int semestre) {
        switch (semestre){
            case 1 -> {
                return "101";
            }
            case 2 -> {
                return "201";
            }
            case 3 -> {
                return "301";
            }
            case 4 -> {
                return "401";
            }
            case 5 -> {
                return "501";
            }
            case 6 -> {
                return "601";
            }
            case 7 -> {
                return "701";
            }
            case 8 -> {
                return "801";
            }
            default -> {
                return "Semestre no existente";
            }
        }
    }

    /*
     * El principio "Don't Repeat Yourself" (DRY) se refiere a evitar la duplicación de código
     * o lógica en un sistema para mejorar la mantenibilidad y reducir errores.
     * En lugar de repetir código, se debe abstraer y reutilizar componentes o funciones para
     * centralizar el conocimiento y facilitar futuros cambios.
     * */
    public String asignarGrupoDry(int semestre) {
        String[] grupos = {"ISW101", "ISW201", "ISW301", "ISW401", "ISW501", "ISW601", "ISW701", "ISW801"};
        return grupos[semestre - 1];
    }

}
