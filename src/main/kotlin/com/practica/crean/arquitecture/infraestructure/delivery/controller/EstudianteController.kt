package com.example.demo.infraestructure.delivery.controller

import com.example.demo.infraestructure.delivery.dto.EstudianteRequest
import com.example.demo.infraestructure.delivery.dto.EstudianteResponse
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern
import org.springframework.http.ResponseEntity

// <>
interface EstudianteController {

    fun altaEstudiante(@Valid request: EstudianteRequest) : ResponseEntity<EstudianteResponse>

    //fun listaEstudiantes(): ResponseEntity<List<EstudianteResponse>>

    fun buscarPorMatricula(@NotBlank(
                               message = "El campo matricula no puede ser estar vacío"
                           )
                           @Pattern(
                               message = "El campo matricula debe de cumplir el patrón S00000000",
                               regexp = "^S[0-9]{8}$"
                           )
                           matricula: String): ResponseEntity<EstudianteResponse>

}