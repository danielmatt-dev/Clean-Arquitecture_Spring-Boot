package com.practica.crean.arquitecture.core.usecases;

import arrow.core.Either;
import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.shared.excepciones.ResourceNotFoundException;

public interface BuscarPorMatricula {

    Estudiante execute(String matricula);

}
