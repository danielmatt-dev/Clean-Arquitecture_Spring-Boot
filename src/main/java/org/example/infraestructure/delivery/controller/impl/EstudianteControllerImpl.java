package org.example.infraestructure.delivery.controller.impl;

import org.example.core.domain.Estudiante;
import org.example.core.usecases.BuscarEstudiantes;
import org.example.core.usecases.BuscarPorMatricula;
import org.example.core.usecases.CrearEstudiante;
import org.example.core.usecases.GuardarEstudiante;
import org.example.infraestructure.delivery.controller.EstudianteController;
import org.example.infraestructure.delivery.dto.EstudianteRequest;
import org.example.infraestructure.delivery.dto.EstudianteResponse;
import org.example.infraestructure.delivery.dto.mapper.EstudianteMapperDto;
import org.example.shared.excepciones.ResourceNotFoundException;

import java.util.List;
import java.util.regex.Pattern;

/*
 * El principio KISS ("Keep It Simple, Stupid") en desarrollo de software sugiere mantener los diseños y
 * soluciones simples, fáciles de entender y mantener, evitando la complejidad innecesaria que podría complicar
 * la implementación y el mantenimiento.
 * */

public class EstudianteControllerImpl implements EstudianteController {

    private BuscarEstudiantes buscarEstudiantes;
    private BuscarPorMatricula buscarPorMatricula;
    private CrearEstudiante crearEstudiante;
    private GuardarEstudiante guardarEstudiante;
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
            EstudianteMapperDto mapperDto
    ) {
        this.buscarEstudiantes = buscarEstudiantes;
        this.buscarPorMatricula = buscarPorMatricula;
        this.crearEstudiante = crearEstudiante;
        this.guardarEstudiante = guardarEstudiante;
        this.mapperDto = mapperDto;
    }

    public EstudianteResponse altaEstudianteDos(EstudianteRequest request) {
        if (request.getNombre() instanceof String || !request.getNombre().isBlank()) {
            if (Pattern.matches("^[a-zA-Z\\s]+$", request.getNombre())) {
                if (request.getApellidos() instanceof String || !request.getApellidos().isBlank()) {
                    if (Pattern.matches("^[a-zA-Z\\s]+$", request.getApellidos())) {
                            if (request.getEdad() >= 1 && request.getEdad() <= 120) {
                                return mapperDto.toResponse(
                                                guardarEstudiante.execute(
                                                        crearEstudiante.execute(request)
                                                )
                                );
                            } else {
                                throw new IllegalArgumentException("Campo edad no válido");
                            }
                    } else {
                        throw new IllegalArgumentException("Campo edad no válido");
                    }
                } else {
                    throw new IllegalArgumentException("Campo edad no válido");
                }
            } else {
                throw new IllegalArgumentException("Campo edad no válido");
            }
        }
        throw new IllegalArgumentException("Campo edad no válido");
    }

    public EstudianteResponse altaEstudiante(EstudianteRequest request) {
        if (request.getNombre().isBlank() || !Pattern.matches("^[a-zA-Z\\s]+$", request.getNombre())) {
            throw new IllegalArgumentException("Campo nombre no válido");
        }
        if (request.getApellidos().isBlank() || !Pattern.matches("^[a-zA-Z\\s]+$", request.getApellidos())) {
            throw new IllegalArgumentException("Campo apellido no válido");
        }
        if (request.getEdad() < 0 || request.getEdad() > 120) {
            throw new IllegalArgumentException("Campo edad no válido");
        }
        Estudiante estudiante = guardarEstudiante.execute(crearEstudiante.execute(request));
        return mapperDto.toResponse(estudiante);
    }

    public List<EstudianteResponse> listaEstudiantes() {
        return mapperDto.toListaEstudiantes(buscarEstudiantes.execute());
    }

    public EstudianteResponse buscarPorMatricula(String matricula) {

        try{
            Estudiante estudiante = buscarPorMatricula.execute(matricula);
            return mapperDto.toResponse(estudiante);
        } catch (Exception e){
            throw new ResourceNotFoundException("Estudiante no encontrado");
        }
    }
}
