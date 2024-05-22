package com.example.demo.infraestructure.delivery.controller.impl;

@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping(value = {"/estudiantes"})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/demo/infraestructure/delivery/controller/impl/EstudianteControllerImpl;", "Lcom/example/demo/infraestructure/delivery/controller/EstudianteController;", "buscarEstudiantes", "Lcom/example/demo/core/usecases/BuscarEstudiantes;", "buscarPorMatricula", "Lcom/example/demo/core/usecases/BuscarPorMatricula;", "crearEstudiante", "Lcom/example/demo/core/usecases/CrearEstudiante;", "guardarEstudiante", "Lcom/example/demo/core/usecases/GuardarEstudiante;", "mapperDto", "Lcom/example/demo/infraestructure/delivery/dto/mapper/EstudianteMapperDto;", "(Lcom/example/demo/core/usecases/BuscarEstudiantes;Lcom/example/demo/core/usecases/BuscarPorMatricula;Lcom/example/demo/core/usecases/CrearEstudiante;Lcom/example/demo/core/usecases/GuardarEstudiante;Lcom/example/demo/infraestructure/delivery/dto/mapper/EstudianteMapperDto;)V", "altaEstudiante", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteResponse;", "request", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteRequest;", "altaEstudianteDos", "altaEstudianteTres", "matricula", "", "crean.arquitecture"})
public class EstudianteControllerImpl implements com.example.demo.infraestructure.delivery.controller.EstudianteController {
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.core.usecases.BuscarEstudiantes buscarEstudiantes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.core.usecases.BuscarPorMatricula buscarPorMatricula = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.core.usecases.CrearEstudiante crearEstudiante = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.core.usecases.GuardarEstudiante guardarEstudiante = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDto mapperDto = null;
    
    public EstudianteControllerImpl(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.usecases.BuscarEstudiantes buscarEstudiantes, @org.jetbrains.annotations.NotNull()
    com.example.demo.core.usecases.BuscarPorMatricula buscarPorMatricula, @org.jetbrains.annotations.NotNull()
    com.example.demo.core.usecases.CrearEstudiante crearEstudiante, @org.jetbrains.annotations.NotNull()
    com.example.demo.core.usecases.GuardarEstudiante guardarEstudiante, @org.springframework.beans.factory.annotation.Qualifier(value = "mapperDto")
    @org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDto mapperDto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> altaEstudianteDos(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.EstudianteRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> altaEstudianteTres(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.EstudianteRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/alta"})
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> altaEstudiante(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.EstudianteRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/buscar/{matricula}"})
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> buscarPorMatricula(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String matricula) {
        return null;
    }
}