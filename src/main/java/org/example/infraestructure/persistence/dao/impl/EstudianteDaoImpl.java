package org.example.infraestructure.persistence.dao.impl;

import org.example.infraestructure.persistence.dao.EstudianteDao;
import org.example.infraestructure.persistence.entity.EstudianteEntity;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoImpl implements EstudianteDao {

    private List<EstudianteEntity> estudiantes;

    public EstudianteDaoImpl(){
        this.estudiantes = new ArrayList<>();
    }

    @Override
    public EstudianteEntity findByMatricula(String matricula) {
        for (EstudianteEntity entity : estudiantes) {
            if (entity.getMatricula().equals(matricula)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public EstudianteEntity save(EstudianteEntity entity) {
        estudiantes.add(entity);
        return entity;
    }

    @Override
    public List<EstudianteEntity> findAll() {
        return estudiantes;
    }
}
