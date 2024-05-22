package com.practica.crean.arquitecture.infraestructure.persistence.mapper;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.infraestructure.persistence.entity.EstudianteEntity;
import org.mapstruct.Mapper;

import java.util.List;

/*
 * MapStruct es una biblioteca de Java que genera automáticamente
 * mapeadores para convertir entre diferentes tipos de objetos,
 * utilizando interfaces anotadas para definir las reglas de mapeo.
 * */
@Mapper(componentModel = "spring")
public interface EstudianteMapper {

    Estudiante toEstudiante(EstudianteEntity entity);

    EstudianteEntity toEstudianteEntity(Estudiante estudiante);

    List<Estudiante> toListaEstudiantes(List<EstudianteEntity> entity);

    List<EstudianteEntity> toListaEstudiantesEntity(List<Estudiante> entity);

}
