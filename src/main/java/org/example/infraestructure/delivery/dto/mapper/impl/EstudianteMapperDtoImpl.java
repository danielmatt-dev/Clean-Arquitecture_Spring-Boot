package org.example.infraestructure.delivery.dto.mapper.impl;

import org.example.core.domain.Estudiante;
import org.example.infraestructure.delivery.dto.EstudianteResponse;
import org.example.infraestructure.delivery.dto.mapper.EstudianteMapperDto;

import java.util.ArrayList;
import java.util.List;

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
