package com.example.demo.core.usecases

import com.example.demo.core.domain.Estudiante

fun interface GuardarEstudiante {

    fun execute(estudiante: Estudiante) : Estudiante

}