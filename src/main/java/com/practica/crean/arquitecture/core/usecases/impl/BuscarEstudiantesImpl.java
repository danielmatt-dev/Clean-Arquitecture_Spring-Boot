package com.practica.crean.arquitecture.core.usecases.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.port.EstudianteRepository;
import com.practica.crean.arquitecture.core.usecases.BuscarEstudiantes;

import java.util.List;

public class BuscarEstudiantesImpl implements BuscarEstudiantes {

    private EstudianteRepository repository;

    public BuscarEstudiantesImpl(EstudianteRepository repository) {
        this.repository = repository;
    }

    /*
    @Override
    public List<Estudiante> execute() {
        return repository.buscarEstudiantes();
    }
     */


}
