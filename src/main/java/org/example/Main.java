package org.example;

import org.example.core.domain.Estudiante;
import org.example.core.port.EstudianteRepository;
import org.example.core.usecases.BuscarEstudiantes;
import org.example.core.usecases.BuscarPorMatricula;
import org.example.core.usecases.CrearEstudiante;
import org.example.core.usecases.GuardarEstudiante;
import org.example.core.usecases.impl.BuscarEstudiantesImpl;
import org.example.core.usecases.impl.BuscarPorMatriculaImpl;
import org.example.core.usecases.impl.CrearEstudianteImpl;
import org.example.core.usecases.impl.GuardarEstudianteImpl;
import org.example.infraestructure.delivery.controller.EstudianteController;
import org.example.infraestructure.delivery.controller.impl.EstudianteControllerImpl;
import org.example.infraestructure.delivery.dto.EstudianteRequest;
import org.example.infraestructure.delivery.dto.EstudianteResponse;
import org.example.infraestructure.delivery.dto.mapper.EstudianteMapperDto;
import org.example.infraestructure.delivery.dto.mapper.impl.EstudianteMapperDtoImpl;
import org.example.infraestructure.persistence.adapter.EstudianteAdapter;
import org.example.infraestructure.persistence.dao.EstudianteDao;
import org.example.infraestructure.persistence.dao.impl.EstudianteDaoImpl;
import org.example.infraestructure.persistence.mapper.EstudianteMapper;
import org.example.infraestructure.persistence.mapper.impl.EstudianteMapperImpl;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*  BD  */
        EstudianteDao estudianteDao = new EstudianteDaoImpl();

        /*  Mapper  */
        EstudianteMapper mapper = new EstudianteMapperImpl();

        /*  Repository  */
        EstudianteRepository repository = new EstudianteAdapter(estudianteDao, mapper);

        /*  Use Cases   */
        BuscarEstudiantes buscarEstudiantes = new BuscarEstudiantesImpl(repository);
        BuscarPorMatricula buscarPorMatricula = new BuscarPorMatriculaImpl(repository);
        CrearEstudiante crearEstudiante = new CrearEstudianteImpl();
        GuardarEstudiante guardarEstudiante = new GuardarEstudianteImpl(repository);

        /*  Mapper Dto  */
        EstudianteMapperDto mapperDto = new EstudianteMapperDtoImpl();

        /*  Controller  */
        EstudianteController estudianteController = new EstudianteControllerImpl(
                buscarEstudiantes,
                buscarPorMatricula,
                crearEstudiante,
                guardarEstudiante,
                mapperDto
        );

        EstudianteRequest requestUno = new EstudianteRequest("Java", "Abuelo", 25);
        EstudianteRequest requestDos = new EstudianteRequest("Dart", "Hijo", 20);
        EstudianteRequest requestTres = new EstudianteRequest("Kotlin", "God", 19);

        estudianteController.altaEstudiante(requestUno);
        estudianteController.altaEstudiante(requestDos);
        estudianteController.altaEstudiante(requestTres);

        List<EstudianteResponse> estudiantes = estudianteController.listaEstudiantes();

        estudiantes.forEach( estudianteResponse ->
                System.out.println(estudianteResponse.toString())
        );

    }
}