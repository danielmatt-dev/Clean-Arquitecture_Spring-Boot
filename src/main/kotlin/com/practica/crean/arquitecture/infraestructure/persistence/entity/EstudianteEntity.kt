package com.example.demo.infraestructure.persistence.entity

import com.example.demo.shared.enums.Carrera
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "estudiantes")
/*
* Las entidades en Jakarta (Jakarta Persistence API) son clases mapeadas
* a tablas de bases de datos mediante anotaciones, representando datos
* persistentes en el sistema
* */
data class EstudianteEntity(

    @Id
    var matricula: String,
    var nombre: String,
    var apellidos: String,
    var edad: Int,
    var carrera: Carrera,
    var grupo: String

)