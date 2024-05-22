package org.example.core.port;

import org.example.core.domain.Estudiante;

import java.util.List;

public interface EstudianteRepository {

    Estudiante buscarPorMatricula(String matricula);

    Estudiante guardarEstudiante(Estudiante estudiante);

    List<Estudiante> buscarEstudiantes();

}
