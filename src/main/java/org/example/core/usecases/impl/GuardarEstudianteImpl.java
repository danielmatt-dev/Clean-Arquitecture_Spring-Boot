package org.example.core.usecases.impl;

import org.example.core.domain.Estudiante;
import org.example.core.port.EstudianteRepository;
import org.example.core.usecases.GuardarEstudiante;

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
