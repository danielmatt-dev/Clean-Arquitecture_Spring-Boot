package com.practica.crean.arquitecture.infraestructure.delivery.controller.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.usecases.BuscarEstudiantes;
import com.practica.crean.arquitecture.core.usecases.BuscarPorMatricula;
import com.practica.crean.arquitecture.core.usecases.CrearEstudiante;
import com.practica.crean.arquitecture.core.usecases.GuardarEstudiante;
import com.practica.crean.arquitecture.infraestructure.delivery.controller.EstudianteController;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteRequest;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteResponse;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.impl.EstudianteMapperDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

/*
 * El principio KISS ("Keep It Simple, Stupid") en desarrollo de software sugiere mantener los diseños y
 * soluciones simples, fáciles de entender y mantener, evitando la complejidad innecesaria que podría complicar
 * la implementación y el mantenimiento.
 * */

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerImpl implements EstudianteController {

    private BuscarEstudiantes buscarEstudiantes;
    private BuscarPorMatricula buscarPorMatricula;
    private CrearEstudiante crearEstudiante;
    private GuardarEstudiante guardarEstudiante;
    @Qualifier("mapperDto")
    private EstudianteMapperDto mapperDto;

    /*
     * La inyección de dependencias es un patrón de diseño que permite proporcionar objetos dependientes
     * a una clase desde el exterior, promoviendo un diseño más modular y fácil de probar.
     * */
    public EstudianteControllerImpl(
            BuscarEstudiantes buscarEstudiantes,
            BuscarPorMatricula buscarPorMatricula,
            CrearEstudiante crearEstudiante,
            GuardarEstudiante guardarEstudiante,
            @Qualifier("mapperDto") EstudianteMapperDto mapperDto
    ) {
        this.buscarEstudiantes = buscarEstudiantes;
        this.buscarPorMatricula = buscarPorMatricula;
        this.crearEstudiante = crearEstudiante;
        this.guardarEstudiante = guardarEstudiante;
        this.mapperDto = mapperDto;
    }

    public ResponseEntity<EstudianteResponse> altaEstudianteDos(EstudianteRequest request) {
        if (request.getNombre() instanceof String || !request.getNombre().isBlank()) {
            if (Pattern.matches("^[a-zA-Z\\s]+$", request.getNombre())) {
                if (request.getApellidos() instanceof String || !request.getApellidos().isBlank()) {
                    if (Pattern.matches("^[a-zA-Z\\s]+$", request.getApellidos())) {
                            if (request.getEdad() >= 1 && request.getEdad() <= 120) {
                                return ResponseEntity.ok().body(
                                        mapperDto.toResponse(
                                                guardarEstudiante.execute(
                                                        crearEstudiante.execute(request)
                                                )
                                        )
                                );
                            } else {
                                return ResponseEntity.badRequest().build();
                            }
                    } else {
                        return ResponseEntity.badRequest().build();
                    }
                } else {
                    return ResponseEntity.badRequest().build();
                }
            } else {
                return ResponseEntity.badRequest().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @Override @PostMapping("/alta")
    public ResponseEntity<EstudianteResponse> altaEstudiante(@RequestBody EstudianteRequest request) {
        if (request.getNombre().isBlank() || !Pattern.matches("^[a-zA-Z\\s]+$", request.getNombre())) {
            return ResponseEntity.badRequest().build();
        }
        if (request.getApellidos().isBlank() || !Pattern.matches("^[a-zA-Z\\s]+$", request.getApellidos())) {
            return ResponseEntity.badRequest().build();
        }
        if (request.getEdad() < 0 || request.getEdad() > 120) {
            return ResponseEntity.badRequest().build();
        }
        Estudiante estudiante = guardarEstudiante.execute(crearEstudiante.execute(request));
        return ResponseEntity.ok().body(mapperDto.toResponse(estudiante));
    }

    /*
    @Override @GetMapping("/todos")
    public ResponseEntity<List<EstudianteResponse>> listaEstudiantes() {
        return ResponseEntity.ok().body(mapper.toListaEstudiantes(buscarEstudiantes.execute()));
    }
     */

    @Override @GetMapping("/buscar/{matricula}")
    public ResponseEntity<EstudianteResponse> buscarPorMatricula(@PathVariable String matricula) {

        try{
            Estudiante estudiante = buscarPorMatricula.execute(matricula);
            return ResponseEntity.ok().body(mapperDto.toResponse(estudiante));
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
