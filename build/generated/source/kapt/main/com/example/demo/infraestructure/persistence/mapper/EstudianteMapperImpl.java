package com.example.demo.infraestructure.persistence.mapper;

import com.example.demo.core.domain.Estudiante;
import com.example.demo.infraestructure.persistence.entity.EstudianteEntity;
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
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public Estudiante toEstudiante(EstudianteEntity estudianteEntity) {
        if ( estudianteEntity == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setMatricula( estudianteEntity.getMatricula() );
        estudiante.setNombre( estudianteEntity.getNombre() );
        estudiante.setApellidos( estudianteEntity.getApellidos() );
        estudiante.setEdad( estudianteEntity.getEdad() );
        estudiante.setCarrera( estudianteEntity.getCarrera() );
        estudiante.setGrupo( estudianteEntity.getGrupo() );

        return estudiante;
    }

    @Override
    public EstudianteEntity toEstudianteEntity(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        String matricula = null;
        String nombre = null;
        String apellidos = null;
        int edad = 0;
        Carrera carrera = null;
        String grupo = null;

        matricula = estudiante.getMatricula();
        nombre = estudiante.getNombre();
        apellidos = estudiante.getApellidos();
        edad = estudiante.getEdad();
        carrera = estudiante.getCarrera();
        grupo = estudiante.getGrupo();

        EstudianteEntity estudianteEntity = new EstudianteEntity( matricula, nombre, apellidos, edad, carrera, grupo );

        return estudianteEntity;
    }

    @Override
    public List<Estudiante> toListaEstudiante(List<EstudianteEntity> estudiantes) {
        if ( estudiantes == null ) {
            return null;
        }

        List<Estudiante> list = new ArrayList<Estudiante>( estudiantes.size() );
        for ( EstudianteEntity estudianteEntity : estudiantes ) {
            list.add( toEstudiante( estudianteEntity ) );
        }

        return list;
    }

    @Override
    public List<EstudianteEntity> toListaEstudianteEntity(List<Estudiante> estudiantes) {
        if ( estudiantes == null ) {
            return null;
        }

        List<EstudianteEntity> list = new ArrayList<EstudianteEntity>( estudiantes.size() );
        for ( Estudiante estudiante : estudiantes ) {
            list.add( toEstudianteEntity( estudiante ) );
        }

        return list;
    }
}
