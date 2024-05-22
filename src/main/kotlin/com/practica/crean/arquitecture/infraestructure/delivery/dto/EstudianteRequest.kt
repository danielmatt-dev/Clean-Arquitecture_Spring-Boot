package com.example.demo.infraestructure.delivery.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length

/*
* Las validaciones de Jakarta proporcionan anotaciones para validar
* restricciones en los datos de los objetos.
* Se usan para asegurar que los datos cumplan con ciertas reglas antes
* de ser procesados.
* */
data class EstudianteRequest (

    @field:NotBlank(
        message = "El campo nombre no puede ser estar vacío"
    )
    @field:Length(
        max = 50,
        message = "El campo nombre no puede tener más de 50 caracteres"
    )
    var nombre: String,

    @field:NotBlank(
        message = "El campo apellidos no puede ser estar vacío"
    )
    @field:Length(
        max = 100,
        message = "El campo apellidos no puede tener más de 100 caracteres"
    )
    var apellidos: String,

    @field:Min(
        value = 18L,
        message = "El campo edad debe ser mayor a cero"
    )
    @field:NotNull(
        message = "El campo apellidos no puede ser estar vacío"
    )
    var edad: Int

)