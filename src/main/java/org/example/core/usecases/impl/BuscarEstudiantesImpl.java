package org.example.core.usecases.impl;

import org.example.core.domain.Estudiante;
import org.example.core.port.EstudianteRepository;
import org.example.core.usecases.BuscarEstudiantes;

import java.util.List;

public class BuscarEstudiantesImpl implements BuscarEstudiantes {

    private EstudianteRepository repository;

    public BuscarEstudiantesImpl(EstudianteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Estudiante> execute() {
        return repository.buscarEstudiantes();
    }

}
