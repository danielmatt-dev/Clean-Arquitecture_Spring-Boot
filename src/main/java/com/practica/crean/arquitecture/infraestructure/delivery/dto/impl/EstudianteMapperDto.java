package com.practica.crean.arquitecture.infraestructure.delivery.dto.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstudianteMapperDto {

    @Mapping(expression = "java(estudiante.getNombre() + ' ' + estudiante.getApellidos())", target = "nombreCompleto")
    EstudianteResponse toResponse(Estudiante estudiante);

    List<EstudianteResponse> toListaEstudiantes(List<Estudiante> estudiantes);

}
