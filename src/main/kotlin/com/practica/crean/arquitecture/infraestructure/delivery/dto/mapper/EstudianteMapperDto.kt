package com.example.demo.infraestructure.delivery.dto.mapper

import com.example.demo.core.domain.Estudiante
import com.example.demo.infraestructure.delivery.dto.EstudianteResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping

// <>
@Mapper(componentModel = "spring")
interface EstudianteMapperDto {

    @Mapping(expression = "java(estudiante.getNombre() + ' ' + estudiante.getApellidos())", target = "nombreCompleto")
    fun toEstudianteResponse(estudiante: Estudiante): EstudianteResponse

    fun toListaEstudiantesResponse(estudiantes: List<Estudiante>): List<EstudianteResponse>

}