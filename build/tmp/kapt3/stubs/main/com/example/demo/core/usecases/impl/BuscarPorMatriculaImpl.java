package com.example.demo.core.usecases.impl;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/demo/core/usecases/impl/BuscarPorMatriculaImpl;", "Lcom/example/demo/core/usecases/BuscarPorMatricula;", "repository", "Lcom/example/demo/core/port/EstudianteRepository;", "(Lcom/example/demo/core/port/EstudianteRepository;)V", "execute", "Larrow/core/Either;", "Lcom/example/demo/shared/excepciones/ResourceNotFoundException;", "Lcom/example/demo/core/domain/Estudiante;", "matricula", "", "crean.arquitecture"})
public final class BuscarPorMatriculaImpl implements com.example.demo.core.usecases.BuscarPorMatricula {
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.core.port.EstudianteRepository repository = null;
    
    public BuscarPorMatriculaImpl(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.port.EstudianteRepository repository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<com.example.demo.shared.excepciones.ResourceNotFoundException, com.example.demo.core.domain.Estudiante> execute(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula) {
        return null;
    }
}