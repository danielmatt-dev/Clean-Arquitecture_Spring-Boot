package com.practica.crean.arquitecture.core.usecases;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteRequest;

public interface CrearEstudiante {

    Estudiante execute(EstudianteRequest estudiante);

}
