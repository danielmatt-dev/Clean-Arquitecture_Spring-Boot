package com.example.demo.infraestructure.delivery.controller.impl

import com.example.demo.core.usecases.BuscarEstudiantes
import com.example.demo.core.usecases.BuscarPorMatricula
import com.example.demo.core.usecases.CrearEstudiante
import com.example.demo.core.usecases.GuardarEstudiante
import com.example.demo.infraestructure.delivery.controller.EstudianteController
import com.example.demo.infraestructure.delivery.dto.EstudianteRequest
import com.example.demo.infraestructure.delivery.dto.EstudianteResponse
import com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDto
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/*
* El principio KISS ("Keep It Simple, Stupid") en desarrollo de software sugiere mantener los diseños y
* soluciones simples, fáciles de entender y mantener, evitando la complejidad innecesaria que podría complicar
* la implementación y el mantenimiento.
* */
@RestController
@RequestMapping("/estudiantes")
class EstudianteControllerImpl(

    /*
    * La inyección de dependencias es un patrón de diseño que permite proporcionar objetos dependientes
    * a una clase desde el exterior, promoviendo un diseño más modular y fácil de probar.
    * */
    private val buscarEstudiantes: BuscarEstudiantes,
    private val buscarPorMatricula: BuscarPorMatricula,
    private val crearEstudiante: CrearEstudiante,
    private val guardarEstudiante: GuardarEstudiante,
    @Qualifier("mapperDto")
    private val mapperDto: EstudianteMapperDto,

) : EstudianteController {

    fun altaEstudianteDos(request: EstudianteRequest): ResponseEntity<EstudianteResponse> {

        if (request.nombre is String || request.nombre.isNotBlank()){
            if (request.nombre.matches(Regex("^[a-zA-Z\\s]+$")))
                if (request.apellidos is String || request.apellidos.isNotBlank()) {
                    if (request.apellidos.matches(Regex("^[a-zA-Z\\s]+$"))) {
                        if (request.edad != null || request.edad.toString().matches(Regex("\\d+"))) {
                            if (request.edad in 0..120) {
                                return ResponseEntity.ok().body(
                                    mapperDto.toEstudianteResponse(
                                        guardarEstudiante.execute(
                                            crearEstudiante.exectute(
                                                request = request
                                            )
                                        )
                                    )
                                )
                            } else {
                                return ResponseEntity.badRequest().build()
                            }
                        } else {
                            return ResponseEntity.badRequest().build()
                        }
                    } else {
                        return ResponseEntity.badRequest().build()
                    }
                } else {
                    return ResponseEntity.badRequest().build()
                }
            } else {
                return ResponseEntity.badRequest().build()
            }

        return ResponseEntity.badRequest().build()
    }

    /*Guard Clauses
    * El principio de Guard Clauses mejora la claridad del código al manejar casos de error o condiciones especiales
    * al inicio de una función, permitiendo que el flujo principal sea más directo y legible. Esto evita la complejidad
    * de múltiples niveles de anidamiento, facilitando el mantenimiento del código.
    * */
    fun altaEstudianteTres(request: EstudianteRequest): ResponseEntity<EstudianteResponse> {

        if (request.nombre.isBlank() || !request.nombre.matches(Regex("^[a-zA-Z\\s]+$"))){
            return ResponseEntity.badRequest().build()
        }

        if (request.apellidos.isBlank() || !request.apellidos.matches(Regex("^[a-zA-Z\\s]+$"))){
            return ResponseEntity.badRequest().build()
        }

        if (request.edad !in 0..120 || request.edad.toString().isBlank()){
            return ResponseEntity.badRequest().build()
        }

        val estudiante = guardarEstudiante.execute(crearEstudiante.exectute(request))
        return ResponseEntity.ok().body(mapperDto.toEstudianteResponse(estudiante))
    }

    @PostMapping("/alta")
    override fun altaEstudiante(@RequestBody request: EstudianteRequest): ResponseEntity<EstudianteResponse> {

        /*
        * require es una función en Kotlin que lanza IllegalArgumentException si su condición es falsa,
        * útil para validar argumentos de funciones.
        * */
        require(request.nombre.isNotBlank() && request.nombre.matches(Regex("^[a-zA-Z\\s]+$"))){
            return ResponseEntity.badRequest().build()
        }

        require(request.apellidos.isNotBlank() && request.apellidos.matches(Regex("^[a-zA-Z\\s]+$"))){
            return ResponseEntity.badRequest().build()
        }

        require(request.edad in 0..120 && request.edad.toString().isNotBlank()){
            return ResponseEntity.badRequest().build()
        }

        val estudiante = guardarEstudiante.execute(crearEstudiante.exectute(request))
        return ResponseEntity.ok().body(mapperDto.toEstudianteResponse(estudiante))
    }

    /*
    @GetMapping("/todos")
    override fun listaEstudiantes(): ResponseEntity<List<EstudianteResponse>> =
        ResponseEntity.ok().body(
            mapperDto.toListaEstudiantesResponse(buscarEstudiantes.execute())
        )
     */

    @GetMapping("/buscar/{matricula}")
    override fun buscarPorMatricula(@PathVariable matricula: String): ResponseEntity<EstudianteResponse> {
        /*
        * El método fold en Either aplica una función left si el valor es un error (Left)
        * y una función right si el valor es un éxito (Right), manejando ambos casos en una sola operación.
        * */
        return buscarPorMatricula.execute(matricula).fold(
            ifRight = { estudiante ->
                ResponseEntity.ok().body(mapperDto.toEstudianteResponse(estudiante))
            },
            ifLeft = {
                ResponseEntity.notFound().build()
            }
        )
    }

}