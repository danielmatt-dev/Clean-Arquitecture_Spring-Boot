package com.example.demo.core.usecases

import com.example.demo.core.domain.Estudiante
import com.example.demo.infraestructure.delivery.dto.EstudianteRequest

fun interface CrearEstudiante {

    fun exectute(request: EstudianteRequest): Estudiante

}