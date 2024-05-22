package com.practica.crean.arquitecture.infraestructure.persistence.adapter;

import com.practica.crean.arquitecture.core.domain.Estudiante;
import com.practica.crean.arquitecture.core.port.EstudianteRepository;
import com.practica.crean.arquitecture.infraestructure.persistence.dao.EstudianteDao;
import com.practica.crean.arquitecture.infraestructure.persistence.entity.EstudianteEntity;
import com.practica.crean.arquitecture.infraestructure.persistence.mapper.EstudianteMapper;
import com.practica.crean.arquitecture.shared.excepciones.ResourceNotFoundException;

import java.util.List;

public class EstudianteAdapter implements EstudianteRepository {

    private EstudianteDao estudianteDao;
    private EstudianteMapper mapper;

    public EstudianteAdapter(EstudianteDao estudianteDao, EstudianteMapper mapper) {
        this.estudianteDao = estudianteDao;
        this.mapper = mapper;
    }

    @Override
    public Estudiante buscarPorMatricula(String matricula) {
        EstudianteEntity entity = estudianteDao.findByMatricula(matricula);
        if (entity==null){
            throw new ResourceNotFoundException("Estudiante no encontrado");
        }
        return mapper.toEstudiante(entity);
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        EstudianteEntity entity = estudianteDao.save(mapper.toEstudianteEntity(estudiante));
        return mapper.toEstudiante(entity);
    }

    /*
    @Override
    public List<Estudiante> buscarEstudiantes() {
        return mapper.toListaEstudiantes(estudianteDao.findAll());
    }
     */
}
