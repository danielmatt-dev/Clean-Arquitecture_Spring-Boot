package com.example.demo.core.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/demo/core/usecases/CrearEstudiante;", "", "exectute", "Lcom/example/demo/core/domain/Estudiante;", "request", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteRequest;", "crean.arquitecture"})
public abstract interface CrearEstudiante {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.core.domain.Estudiante exectute(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.EstudianteRequest request);
}