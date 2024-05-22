package com.example.demo.infraestructure.delivery.dto
import com.example.demo.shared.enums.Carrera

/*
* El patrón DTO (Data Transfer Object) se usa para transferir datos entre capas de una aplicación,
* especialmente entre el cliente y el servidor. Simplifica y optimiza la comunicación, reduciendo
* el número de llamadas y acoplando menos la lógica de negocio con la presentación.
* */
data class EstudianteResponse (

    var matricula: String,
    var nombreCompleto: String,
    var carrera: Carrera,
    var grupo: String

)