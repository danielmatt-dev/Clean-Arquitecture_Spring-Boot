package com.example.demo.core.port

import arrow.core.Either
import com.example.demo.core.domain.Estudiante
import com.example.demo.shared.excepciones.ResourceNotFoundException

// <>
interface EstudianteRepository {
    /*
    * Either es una estructura de datos en Kotlin usada para representar un valor que puede ser
    * de dos tipos posibles, típicamente Left para un error o fallo y Right para un resultado exitoso,
    * facilitando el manejo de errores y resultados en operaciones.
    * */
    fun buscarPorMatricula(matricula: String): Either<ResourceNotFoundException, Estudiante>

    fun guardarEstudiante(estudiante: Estudiante) : Estudiante

    //fun buscarEstudiantes() : List<Estudiante>

}