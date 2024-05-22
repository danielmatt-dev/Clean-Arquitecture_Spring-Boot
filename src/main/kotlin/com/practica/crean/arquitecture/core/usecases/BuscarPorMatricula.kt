package com.example.demo.core.usecases

import arrow.core.Either
import com.example.demo.core.domain.Estudiante
import com.example.demo.shared.excepciones.ResourceNotFoundException

// <>
fun interface BuscarPorMatricula {

    fun execute(matricula: String): Either<ResourceNotFoundException, Estudiante>

}