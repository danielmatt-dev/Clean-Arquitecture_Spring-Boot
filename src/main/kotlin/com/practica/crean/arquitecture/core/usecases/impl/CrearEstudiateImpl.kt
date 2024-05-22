package com.example.demo.core.usecases.impl

import com.example.demo.core.domain.Estudiante
import com.example.demo.core.usecases.CrearEstudiante
import com.example.demo.infraestructure.delivery.dto.EstudianteRequest
import com.example.demo.shared.enums.Carrera
import kotlin.random.Random

class CrearEstudiateImpl : CrearEstudiante {

    override fun exectute(request: EstudianteRequest): Estudiante {

        /*
        * La función apply en Kotlin ejecuta un bloque de código en el contexto de un objeto receptor
        * y devuelve ese mismo objeto, facilitando la inicialización y configuración de propiedades.
        * */
        return Estudiante().apply {
            generarMatricula()
            nombre = request.nombre
            apellidos = request.apellidos
            edad = request.edad
            carrera = Carrera.`Ingeniería de Software`
            asignarGrupoDry(Random.nextInt(1, 4))
        }
    }

}