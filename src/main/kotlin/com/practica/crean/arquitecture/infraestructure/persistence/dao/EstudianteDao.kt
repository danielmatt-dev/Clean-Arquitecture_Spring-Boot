package com.example.demo.infraestructure.persistence.dao

import com.example.demo.infraestructure.persistence.entity.EstudianteEntity
import org.springframework.data.jpa.repository.JpaRepository

/*
* JPA (Java Persistence API) es una especificación de Java que proporciona
* una forma estándar de gestionar datos relacionales en aplicaciones
* Java utilizando un modelo de objetos. Simplifica el acceso a bases de
* datos mediante la abstracción del mapeo objeto-relacional (ORM).
* */
interface EstudianteDao : JpaRepository<EstudianteEntity, String> {

    fun findByMatricula(matricula: String): EstudianteEntity?

}