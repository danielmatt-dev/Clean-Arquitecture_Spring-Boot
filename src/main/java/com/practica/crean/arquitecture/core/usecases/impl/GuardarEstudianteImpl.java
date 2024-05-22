package com.practica.crean.arquitecture.core.usecases.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.port.EstudianteRepository;
import com.practica.crean.arquitecture.core.usecases.GuardarEstudiante;

public class GuardarEstudianteImpl implements GuardarEstudiante {

    private EstudianteRepository repository;

    public GuardarEstudianteImpl(EstudianteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Estudiante execute(Estudiante estudiante) {
        return repository.guardarEstudiante(estudiante);
    }

}
