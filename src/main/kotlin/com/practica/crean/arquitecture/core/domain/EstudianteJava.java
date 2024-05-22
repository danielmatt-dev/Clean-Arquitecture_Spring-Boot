package com.practica.crean.arquitecture.core.domain;

import java.util.Objects;

public class EstudianteJava {

    private String matricula;
    private String nombre;
    private String apellidos;
    private int edad;
    private String grupo;

    public EstudianteJava(String matricula, String nombre, String apellidos, int edad, String grupo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudianteJava that = (EstudianteJava) o;
        return edad == that.edad && Objects.equals(matricula, that.matricula) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return "EstudianteJava{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

}
