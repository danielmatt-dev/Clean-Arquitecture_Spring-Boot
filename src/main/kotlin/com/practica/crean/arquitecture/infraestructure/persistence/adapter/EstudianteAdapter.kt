package com.example.demo.infraestructure.persistence.adapter

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import com.example.demo.core.domain.Estudiante
import com.example.demo.core.port.EstudianteRepository
import com.example.demo.infraestructure.persistence.dao.EstudianteDao
import com.example.demo.infraestructure.persistence.mapper.EstudianteMapper
import com.example.demo.shared.excepciones.ResourceNotFoundException

// <>
class EstudianteAdapter(

    private val estudianteDao: EstudianteDao,
    private val mapper: EstudianteMapper

) : EstudianteRepository {

    // Buscar a un estudiante por matricula (id)
    override fun buscarPorMatricula(matricula: String): Either<ResourceNotFoundException, Estudiante> =
        /*
        * La función let en Kotlin ejecuta un bloque de código solo si el objeto receptor no es nulo,
        * proporcionando el objeto como argumento (it) dentro del bloque.
        * */
        estudianteDao.findByMatricula(matricula)?.let { entity -> mapper.toEstudiante(entity).right() }
            /*
            * El operador Elvis (?:) en Kotlin proporciona un valor predeterminado cuando una expresión
            * es null, permitiendo manejar fácilmente valores nulos.
            * */
            ?: ResourceNotFoundException("Estudiante no encontrado").left()

    // Función que llama al repositorio para almacenar al estudiante
    override fun guardarEstudiante(estudiante: Estudiante): Estudiante {
        return estudianteDao.save(mapper.toEstudianteEntity(estudiante)).let { entity ->
            mapper.toEstudiante(entity)
        }
    }

    /*
    override fun buscarEstudiantes(): List<Estudiante> = mapper.toListaEstudiante(estudianteDao.findAll())
     */

}