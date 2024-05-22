package com.practica.crean.arquitecture.infraestructure.delivery.dto;

import com.practica.crean.arquitecture.shared.enums.Carrera;

/*
 * El patrón DTO (Data Transfer Object) se usa para transferir datos entre capas de una aplicación,
 * especialmente entre el cliente y el servidor. Simplifica y optimiza la comunicación, reduciendo
 * el número de llamadas y acoplando menos la lógica de negocio con la presentación.
 * */
public class EstudianteResponse {

    private String matricula;
    private String nombreCompleto;
    private Carrera carrera;
    private String grupo;

    public EstudianteResponse() {}

    public EstudianteResponse(String matricula, String nombreCompleto, Carrera carrera, String grupo) {
        this.matricula = matricula;
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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
