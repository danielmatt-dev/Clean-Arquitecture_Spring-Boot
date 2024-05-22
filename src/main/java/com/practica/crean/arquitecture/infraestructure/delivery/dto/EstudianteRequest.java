package com.practica.crean.arquitecture.infraestructure.delivery.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/*
 * Las validaciones de Jakarta proporcionan anotaciones para validar
 * restricciones en los datos de los objetos.
 * Se usan para asegurar que los datos cumplan con ciertas reglas antes
 * de ser procesados.
 * */
public class EstudianteRequest {

    @NotBlank(message = "El campo nombre no puede ser estar vacío")
    @Length(
            max = 50,
            message = "El campo nombre no puede tener más de 50 caracteres"
    )
    private String nombre;
    @NotBlank(
            message = "El campo apellidos no puede ser estar vacío"
    )
    @Length(
            max = 100,
            message = "El campo apellidos no puede tener más de 100 caracteres"
    )
    private String apellidos;
    @Min(
            value = 0L,
            message = "El campo edad debe ser mayor a cero"
    )
    @NotNull(
            message = "El campo apellidos no puede ser estar vacío"
    )
    private int edad;

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
}
