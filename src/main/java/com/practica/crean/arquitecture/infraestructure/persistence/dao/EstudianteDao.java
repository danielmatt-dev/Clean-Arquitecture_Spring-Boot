package com.practica.crean.arquitecture.infraestructure.persistence.dao;

import com.practica.crean.arquitecture.infraestructure.persistence.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * JPA (Java Persistence API) es una especificación de Java que proporciona
 * una forma estándar de gestionar datos relacionales en aplicaciones
 * Java utilizando un modelo de objetos. Simplifica el acceso a bases de
 * datos mediante la abstracción del mapeo objeto-relacional (ORM).
 * */
public interface EstudianteDao extends JpaRepository<EstudianteEntity, String> {

    EstudianteEntity findByMatricula(String matricula);

}
