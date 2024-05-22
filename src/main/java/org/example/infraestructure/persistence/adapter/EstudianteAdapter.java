package org.example.infraestructure.persistence.adapter;

import org.example.core.domain.Estudiante;
import org.example.core.port.EstudianteRepository;
import org.example.infraestructure.persistence.dao.EstudianteDao;
import org.example.infraestructure.persistence.entity.EstudianteEntity;
import org.example.infraestructure.persistence.mapper.EstudianteMapper;
import org.example.shared.excepciones.ResourceNotFoundException;
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

    @Override
    public List<Estudiante> buscarEstudiantes() {
        return mapper.toListaEstudiantes(estudianteDao.findAll());
    }

}
