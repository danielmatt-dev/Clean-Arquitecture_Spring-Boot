package com.practica.crean.arquitecture.infraestructure.persistence.entity;

import com.practica.crean.arquitecture.shared.enums.Carrera;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
/*
 * Las entidades en Jakarta (Jakarta Persistence API) son clases mapeadas
 * a tablas de bases de datos mediante anotaciones, representando datos
 * persistentes en el sistema
 * */
public class EstudianteEntity {

    @Id
    private String matricula;
    private String nombre;
    private String apellidos;
    private int edad;
    private Carrera carrera;
    private String grupo;

    public EstudianteEntity() {}

    public EstudianteEntity(String matricula, String nombre, String apellidos, int edad, Carrera carrera, String grupo) {
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

}
