package org.example.infraestructure.delivery.controller;

import org.example.infraestructure.delivery.dto.EstudianteRequest;
import org.example.infraestructure.delivery.dto.EstudianteResponse;

import java.util.List;

public interface EstudianteController {

    EstudianteResponse altaEstudiante(EstudianteRequest request);

    List<EstudianteResponse> listaEstudiantes();

    EstudianteResponse buscarPorMatricula(String matricula);

}
