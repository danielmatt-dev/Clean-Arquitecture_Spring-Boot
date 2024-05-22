package com.example.demo.core.usecases.impl

import arrow.core.Either
import com.example.demo.core.domain.Estudiante
import com.example.demo.core.port.EstudianteRepository
import com.example.demo.core.usecases.BuscarPorMatricula
import com.example.demo.shared.excepciones.ResourceNotFoundException

class BuscarPorMatriculaImpl(

    private val repository: EstudianteRepository

) : BuscarPorMatricula {

    override fun execute(matricula: String): Either<ResourceNotFoundException, Estudiante> =
        repository.buscarPorMatricula(matricula)

}