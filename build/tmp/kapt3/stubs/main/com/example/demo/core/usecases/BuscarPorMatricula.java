package com.example.demo.core.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/demo/core/usecases/BuscarPorMatricula;", "", "execute", "Larrow/core/Either;", "Lcom/example/demo/shared/excepciones/ResourceNotFoundException;", "Lcom/example/demo/core/domain/Estudiante;", "matricula", "", "crean.arquitecture"})
public abstract interface BuscarPorMatricula {
    
    @org.jetbrains.annotations.NotNull()
    public abstract arrow.core.Either<com.example.demo.shared.excepciones.ResourceNotFoundException, com.example.demo.core.domain.Estudiante> execute(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula);
}