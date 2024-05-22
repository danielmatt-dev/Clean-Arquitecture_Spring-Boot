package org.example.core.usecases.impl;

import org.example.core.domain.Estudiante;
import org.example.core.usecases.CrearEstudiante;
import org.example.infraestructure.delivery.dto.EstudianteRequest;
import org.example.shared.enums.Carrera;

import java.util.Random;

public class CrearEstudianteImpl implements CrearEstudiante {
    @Override
    public Estudiante execute(EstudianteRequest request) {
        Estudiante estudiante = new Estudiante();
        estudiante.setMatricula(estudiante.generarMatricula());
        estudiante.setNombre(request.getNombre());
        estudiante.setApellidos(request.getApellidos());
        estudiante.setEdad(request.getEdad());
        estudiante.setCarrera(Carrera.Ingeniería_de_software);
        estudiante.setGrupo(estudiante.asignarGrupoDry(new Random().nextInt(4) + 1));
        return estudiante;
    }
}
