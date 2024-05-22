package com.example.demo.core.port;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/example/demo/core/port/EstudianteRepository;", "", "buscarPorMatricula", "Larrow/core/Either;", "Lcom/example/demo/shared/excepciones/ResourceNotFoundException;", "Lcom/example/demo/core/domain/Estudiante;", "matricula", "", "guardarEstudiante", "estudiante", "crean.arquitecture"})
public abstract interface EstudianteRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<com.example.demo.shared.excepciones.ResourceNotFoundException, com.example.demo.core.domain.Estudiante> buscarPorMatricula(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.core.domain.Estudiante guardarEstudiante(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.domain.Estudiante estudiante);
}