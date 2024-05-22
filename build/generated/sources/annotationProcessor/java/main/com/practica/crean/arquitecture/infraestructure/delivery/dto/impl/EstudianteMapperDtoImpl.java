package com.practica.crean.arquitecture.infraestructure.delivery.dto.impl;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.infraestructure.delivery.dto.EstudianteResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-18T21:43:01-0600",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EstudianteMapperDtoImpl implements EstudianteMapperDto {

    @Override
    public EstudianteResponse toResponse(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        EstudianteResponse estudianteResponse = new EstudianteResponse();

        estudianteResponse.setMatricula( estudiante.getMatricula() );
        estudianteResponse.setCarrera( estudiante.getCarrera() );
        estudianteResponse.setGrupo( estudiante.getGrupo() );

        estudianteResponse.setNombreCompleto( estudiante.getNombre() + ' ' + estudiante.getApellidos() );

        return estudianteResponse;
    }

    @Override
    public List<EstudianteResponse> toListaEstudiantes(List<Estudiante> estudiantes) {
        if ( estudiantes == null ) {
            return null;
        }

        List<EstudianteResponse> list = new ArrayList<EstudianteResponse>( estudiantes.size() );
        for ( Estudiante estudiante : estudiantes ) {
            list.add( toResponse( estudiante ) );
        }

        return list;
    }
}
