package org.example.core.usecases;

import org.example.core.domain.Estudiante;
import org.example.infraestructure.delivery.dto.EstudianteRequest;

public interface CrearEstudiante {

    Estudiante execute(EstudianteRequest estudiante);

}
