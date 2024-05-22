package com.example.demo.core.usecases.impl

import com.example.demo.core.domain.Estudiante
import com.example.demo.core.port.EstudianteRepository
import com.example.demo.core.usecases.GuardarEstudiante

class GuardarEstudianteImpl(

    private val repository: EstudianteRepository

) : GuardarEstudiante {

    override fun execute(estudiante: Estudiante): Estudiante = repository.guardarEstudiante(estudiante)

}