package com.practica.crean.arquitecture.infraestructure.config;

import com.practica.crean.arquitecture.core.port.EstudianteRepository;
import com.practica.crean.arquitecture.core.usecases.*;
import com.practica.crean.arquitecture.core.usecases.impl.*;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.impl.EstudianteMapperDto;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.impl.EstudianteMapperDtoImpl;
import com.practica.crean.arquitecture.infraestructure.persistence.adapter.EstudianteAdapter;
import com.practica.crean.arquitecture.infraestructure.persistence.dao.EstudianteDao;
import com.practica.crean.arquitecture.infraestructure.persistence.mapper.EstudianteMapper;
import com.practica.crean.arquitecture.infraestructure.persistence.mapper.EstudianteMapperImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class EstudianteConfig {

    private EstudianteDao estudianteDao;

    public EstudianteConfig(EstudianteDao estudianteDao) {
        this.estudianteDao = estudianteDao;
    }

    /**
     * El principio de sustitución de Liskov establece que los objetos de una clase derivada
     * deben ser sustituibles por objetos de su clase base sin alterar el comportamiento correcto
     * del programa. Es fundamental para garantizar que la herencia preserve la integridad del sistema
     * y permita la reutilización de código sin sorpresas.
     */

    /**
     * El patrón Singleton asegura que una clase tenga una única instancia a lo largo del sistema y proporciona
     * un punto global de acceso a esa instancia. Es útil para gestionar recursos compartidos como bases de datos
     * o configuraciones globales, evitando la creación de múltiples instancias innecesarias.
     */

    @Bean
    public EstudianteMapper estudianteMapper() {
        return new EstudianteMapperImpl();
    }

    @Bean
    @Qualifier("mapperDto")
    public EstudianteMapperDto estudianteMapperDto() {
        return new EstudianteMapperDtoImpl();
    }

    @Bean
    public EstudianteRepository estudianteRepository() {
        return new EstudianteAdapter(
                estudianteDao,
                estudianteMapper()
        );
    }

    @Bean
    public BuscarEstudiantes buscarEstudiantes() {
        return new BuscarEstudiantesImpl(estudianteRepository());
    }

    @Bean
    public BuscarPorMatricula buscarPorMatricula() {
        return new BuscarPorMatriculaImpl(estudianteRepository());
    }

    @Bean
    public CrearEstudiante crearEstudiante() {
        return new CrearEstudianteImpl();
    }

    @Bean
    public GuardarEstudiante guardarEstudiante() {
        return new GuardarEstudianteImpl(estudianteRepository());
    }

}
