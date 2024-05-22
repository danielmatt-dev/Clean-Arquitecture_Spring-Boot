package com.example.demo.infraestructure.config

import com.example.demo.core.port.EstudianteRepository
import com.example.demo.core.usecases.BuscarEstudiantes
import com.example.demo.core.usecases.BuscarPorMatricula
import com.example.demo.core.usecases.CrearEstudiante
import com.example.demo.core.usecases.GuardarEstudiante
import com.example.demo.core.usecases.impl.BuscarEstudiantesImpl
import com.example.demo.core.usecases.impl.BuscarPorMatriculaImpl
import com.example.demo.core.usecases.impl.CrearEstudiateImpl
import com.example.demo.core.usecases.impl.GuardarEstudianteImpl
import com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDto
import com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDtoImpl
import com.example.demo.infraestructure.persistence.adapter.EstudianteAdapter
import com.example.demo.infraestructure.persistence.dao.EstudianteDao
import com.example.demo.infraestructure.persistence.mapper.EstudianteMapper
import com.example.demo.infraestructure.persistence.mapper.EstudianteMapperImpl
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
class EstudianteConfig(

    private val estudianteDao: EstudianteDao

) {

    /*Liskov
    * El principio de sustitución de Liskov establece que los objetos de una clase derivada
    * deben ser sustituibles por objetos de su clase base sin alterar el comportamiento correcto
    * del programa. Es fundamental para garantizar que la herencia preserve la integridad del sistema
    * y permita la reutilización de código sin sorpresas
    * */

    /*Singleton
    * El patrón Singleton asegura que una clase tenga una única instancia a lo largo del sistema y proporciona
    * un punto global de acceso a esa instancia. Es útil para gestionar recursos compartidos como bases de datos
    * o configuraciones globales, evitando la creación de múltiples instancias innecesarias.
    * */

    @Bean
    fun estudianteMapper() : EstudianteMapper = EstudianteMapperImpl()

    @Bean @Qualifier("mapperDto")
    fun estudianteMapperDto(): EstudianteMapperDto = EstudianteMapperDtoImpl()

    @Bean
    fun estudianteRepository() : EstudianteRepository = EstudianteAdapter(
        estudianteDao,
        estudianteMapper()
    )

    @Bean
    fun buscarEstudiantes() : BuscarEstudiantes = BuscarEstudiantesImpl(estudianteRepository())

    @Bean
    fun buscarPorMatricula() : BuscarPorMatricula = BuscarPorMatriculaImpl(estudianteRepository())

    @Bean
    fun crearEstudiante() : CrearEstudiante = CrearEstudiateImpl()

    @Bean
    fun guardarEstudiante() : GuardarEstudiante = GuardarEstudianteImpl(estudianteRepository())

}