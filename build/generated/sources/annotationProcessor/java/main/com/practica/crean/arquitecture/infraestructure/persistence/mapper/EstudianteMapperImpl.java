package com.practica.crean.arquitecture.infraestructure.persistence.mapper;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.infraestructure.persistence.entity.EstudianteEntity;
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
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public Estudiante toEstudiante(EstudianteEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setMatricula( entity.getMatricula() );
        estudiante.setNombre( entity.getNombre() );
        estudiante.setApellidos( entity.getApellidos() );
        estudiante.setEdad( entity.getEdad() );
        estudiante.setCarrera( entity.getCarrera() );
        estudiante.setGrupo( entity.getGrupo() );

        return estudiante;
    }

    @Override
    public EstudianteEntity toEstudianteEntity(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        EstudianteEntity estudianteEntity = new EstudianteEntity();

        estudianteEntity.setMatricula( estudiante.getMatricula() );
        estudianteEntity.setNombre( estudiante.getNombre() );
        estudianteEntity.setApellidos( estudiante.getApellidos() );
        estudianteEntity.setEdad( estudiante.getEdad() );
        estudianteEntity.setCarrera( estudiante.getCarrera() );
        estudianteEntity.setGrupo( estudiante.getGrupo() );

        return estudianteEntity;
    }

    @Override
    public List<Estudiante> toListaEstudiantes(List<EstudianteEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<Estudiante> list = new ArrayList<Estudiante>( entity.size() );
        for ( EstudianteEntity estudianteEntity : entity ) {
            list.add( toEstudiante( estudianteEntity ) );
        }

        return list;
    }

    @Override
    public List<EstudianteEntity> toListaEstudiantesEntity(List<Estudiante> entity) {
        if ( entity == null ) {
            return null;
        }

        List<EstudianteEntity> list = new ArrayList<EstudianteEntity>( entity.size() );
        for ( Estudiante estudiante : entity ) {
            list.add( toEstudianteEntity( estudiante ) );
        }

        return list;
    }
}
