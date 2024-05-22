package com.example.demo.infraestructure.delivery.dto.mapper;

import com.example.demo.core.domain.Estudiante;
import com.example.demo.infraestructure.delivery.dto.EstudianteResponse;
import com.example.demo.shared.enums.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-18T19:54:36-0600",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.23.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EstudianteMapperDtoImpl implements EstudianteMapperDto {

    @Override
    public EstudianteResponse toEstudianteResponse(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        String matricula = null;
        Carrera carrera = null;
        String grupo = null;

        matricula = estudiante.getMatricula();
        carrera = estudiante.getCarrera();
        grupo = estudiante.getGrupo();

        String nombreCompleto = estudiante.getNombre() + ' ' + estudiante.getApellidos();

        EstudianteResponse estudianteResponse = new EstudianteResponse( matricula, nombreCompleto, carrera, grupo );

        return estudianteResponse;
    }

    @Override
    public List<EstudianteResponse> toListaEstudiantesResponse(List<Estudiante> estudianes) {
        if ( estudianes == null ) {
            return null;
        }

        List<EstudianteResponse> list = new ArrayList<EstudianteResponse>( estudianes.size() );
        for ( Estudiante estudiante : estudianes ) {
            list.add( toEstudianteResponse( estudiante ) );
        }

        return list;
    }
}
