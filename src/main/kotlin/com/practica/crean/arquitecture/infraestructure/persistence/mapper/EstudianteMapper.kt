package com.example.demo.infraestructure.persistence.mapper

import com.example.demo.core.domain.Estudiante
import com.example.demo.infraestructure.persistence.entity.EstudianteEntity
import org.mapstruct.Mapper

/*
* MapStruct es una biblioteca de Java que genera automáticamente
* mapeadores para convertir entre diferentes tipos de objetos,
* utilizando interfaces anotadas para definir las reglas de mapeo.
* */
@Mapper(componentModel = "spring")
interface EstudianteMapper {

    fun toEstudiante(estudianteEntity: EstudianteEntity): Estudiante

    fun toEstudianteEntity(estudiante: Estudiante): EstudianteEntity

    fun toListaEstudiante(estudiantes: List<EstudianteEntity>): List<Estudiante>

    fun toListaEstudianteEntity(estudiantes: List<Estudiante>): List<EstudianteEntity>

}