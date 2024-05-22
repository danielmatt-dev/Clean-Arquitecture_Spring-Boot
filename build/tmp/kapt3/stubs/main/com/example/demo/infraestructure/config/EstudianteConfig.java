package com.example.demo.infraestructure.config;

@org.springframework.context.annotation.Configuration()
@org.springframework.boot.autoconfigure.EnableAutoConfiguration()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/demo/infraestructure/config/EstudianteConfig;", "", "estudianteDao", "Lcom/example/demo/infraestructure/persistence/dao/EstudianteDao;", "(Lcom/example/demo/infraestructure/persistence/dao/EstudianteDao;)V", "buscarEstudiantes", "Lcom/example/demo/core/usecases/BuscarEstudiantes;", "buscarPorMatricula", "Lcom/example/demo/core/usecases/BuscarPorMatricula;", "crearEstudiante", "Lcom/example/demo/core/usecases/CrearEstudiante;", "estudianteMapper", "Lcom/example/demo/infraestructure/persistence/mapper/EstudianteMapper;", "estudianteMapperDto", "Lcom/example/demo/infraestructure/delivery/dto/mapper/EstudianteMapperDto;", "estudianteRepository", "Lcom/example/demo/core/port/EstudianteRepository;", "guardarEstudiante", "Lcom/example/demo/core/usecases/GuardarEstudiante;", "crean.arquitecture"})
public class EstudianteConfig {
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.infraestructure.persistence.dao.EstudianteDao estudianteDao = null;
    
    public EstudianteConfig(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.persistence.dao.EstudianteDao estudianteDao) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.infraestructure.persistence.mapper.EstudianteMapper estudianteMapper() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.springframework.beans.factory.annotation.Qualifier(value = "mapperDto")
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.infraestructure.delivery.dto.mapper.EstudianteMapperDto estudianteMapperDto() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.port.EstudianteRepository estudianteRepository() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.usecases.BuscarEstudiantes buscarEstudiantes() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.usecases.BuscarPorMatricula buscarPorMatricula() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.usecases.CrearEstudiante crearEstudiante() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.usecases.GuardarEstudiante guardarEstudiante() {
        return null;
    }
}