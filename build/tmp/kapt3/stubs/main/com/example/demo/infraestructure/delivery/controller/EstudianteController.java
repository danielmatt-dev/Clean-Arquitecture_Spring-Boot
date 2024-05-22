package com.example.demo.infraestructure.delivery.controller;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/demo/infraestructure/delivery/controller/EstudianteController;", "", "altaEstudiante", "Lorg/springframework/http/ResponseEntity;", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteResponse;", "request", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteRequest;", "buscarPorMatricula", "matricula", "", "crean.arquitecture"})
public abstract interface EstudianteController {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> altaEstudiante(@jakarta.validation.Valid()
    @org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.delivery.dto.EstudianteRequest request);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.http.ResponseEntity<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> buscarPorMatricula(@jakarta.validation.constraints.NotBlank(message = "El campo matricula no puede ser estar vac\u00edo")
    @jakarta.validation.constraints.Pattern(regexp = "^S[0-9]{8}$", message = "El campo matricula debe de cumplir el patr\u00f3n S00000000")
    @org.jetbrains.annotations.NotNull()
    java.lang.String matricula);
}