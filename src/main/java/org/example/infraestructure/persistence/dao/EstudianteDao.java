package org.example.infraestructure.persistence.dao;

import org.example.infraestructure.persistence.entity.EstudianteEntity;

import java.util.List;

public interface EstudianteDao {

    EstudianteEntity findByMatricula(String matricula);

    EstudianteEntity save(EstudianteEntity entity);

    List<EstudianteEntity> findAll();

}
