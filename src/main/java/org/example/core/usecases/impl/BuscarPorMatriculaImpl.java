package org.example.core.usecases.impl;

import org.example.core.domain.Estudiante;
import org.example.core.port.EstudianteRepository;
import org.example.core.usecases.BuscarPorMatricula;

public class BuscarPorMatriculaImpl implements BuscarPorMatricula {

    private EstudianteRepository repository;

    public BuscarPorMatriculaImpl(EstudianteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Estudiante execute(String matricula) {
        return repository.buscarPorMatricula(matricula);
    }

}
