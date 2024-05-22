package com.practica.crean.arquitecture.core.usecases.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.usecases.CrearEstudiante;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteRequest;
import com.practica.crean.arquitecture.shared.enums.Carrera;

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
