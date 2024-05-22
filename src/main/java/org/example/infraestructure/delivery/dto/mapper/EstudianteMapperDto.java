package org.example.infraestructure.delivery.dto.mapper;

import org.example.core.domain.Estudiante;
import org.example.infraestructure.delivery.dto.EstudianteResponse;

import java.util.List;

public interface EstudianteMapperDto {

    EstudianteResponse toResponse(Estudiante estudiante);

    List<EstudianteResponse> toListaEstudiantes(List<Estudiante> estudiantes);

}
