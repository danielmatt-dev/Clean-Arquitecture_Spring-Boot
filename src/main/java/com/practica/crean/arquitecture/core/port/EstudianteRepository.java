package com.practica.crean.arquitecture.core.port;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import java.util.List;

public interface EstudianteRepository {

    Estudiante buscarPorMatricula(String matricula);

    Estudiante guardarEstudiante(Estudiante estudiante);

    //List<Estudiante> buscarEstudiantes();

}
