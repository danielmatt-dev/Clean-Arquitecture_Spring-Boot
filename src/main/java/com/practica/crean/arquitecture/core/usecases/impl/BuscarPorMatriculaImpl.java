package com.practica.crean.arquitecture.core.usecases.impl;

import arrow.core.Either;
import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.port.EstudianteRepository;
import com.practica.crean.arquitecture.core.usecases.BuscarPorMatricula;
import com.practica.crean.arquitecture.shared.excepciones.ResourceNotFoundException;

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
