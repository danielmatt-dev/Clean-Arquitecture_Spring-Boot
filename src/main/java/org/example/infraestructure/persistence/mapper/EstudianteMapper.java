package org.example.infraestructure.persistence.mapper;

import org.example.core.domain.Estudiante;
import org.example.infraestructure.persistence.entity.EstudianteEntity;

import java.util.List;

public interface EstudianteMapper {

    Estudiante toEstudiante(EstudianteEntity entity);

    EstudianteEntity toEstudianteEntity(Estudiante estudiante);

    List<Estudiante> toListaEstudiantes(List<EstudianteEntity> entity);

    List<EstudianteEntity> toListaEstudiantesEntity(List<Estudiante> entity);

}
