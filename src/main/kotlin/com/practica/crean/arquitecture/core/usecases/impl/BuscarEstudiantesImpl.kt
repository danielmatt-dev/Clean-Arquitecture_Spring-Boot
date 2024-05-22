package com.example.demo.core.usecases.impl

import com.example.demo.core.domain.Estudiante
import com.example.demo.core.port.EstudianteRepository
import com.example.demo.core.usecases.BuscarEstudiantes

class BuscarEstudiantesImpl(

    private val repository: EstudianteRepository

) : BuscarEstudiantes {

    //override fun execute(): List<Estudiante> = repository.buscarEstudiantes()

}