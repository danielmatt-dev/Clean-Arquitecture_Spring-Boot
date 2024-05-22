package com.practica.crean.arquitecture.infraestructure.delivery.controller;

import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteRequest;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface EstudianteController {

    ResponseEntity<EstudianteResponse> altaEstudiante(@Valid EstudianteRequest request);

    //ResponseEntity<List<EstudianteResponse>> listaEstudiantes();

    ResponseEntity<EstudianteResponse> buscarPorMatricula(@NotBlank(
                                                 message = "El campo matricula no puede ser estar vacío"
                                          )
                                          @Pattern(
                                                  message = "El campo matricula debe de cumplir el patrón S00000000",
                                                  regexp = "^S[0-9]{8}$"
                                          )String matricula);

}
