package org.example.core.usecases;

import org.example.core.domain.Estudiante;

public interface BuscarPorMatricula {

    Estudiante execute(String matricula);

}
