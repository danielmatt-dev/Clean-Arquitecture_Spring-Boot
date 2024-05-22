package com.example.demo.infraestructure.delivery.dto.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/demo/infraestructure/delivery/dto/mapper/EstudianteMapperDto;", "", "toEstudianteResponse", "Lcom/example/demo/infraestructure/delivery/dto/EstudianteResponse;", "estudiante", "Lcom/example/demo/core/domain/Estudiante;", "toListaEstudiantesResponse", "", "estudianes", "crean.arquitecture"})
@org.mapstruct.Mapper(componentModel = "spring")
public abstract interface EstudianteMapperDto {
    
    @org.mapstruct.Mapping(expression = "java(estudiante.getNombre() + \' \' + estudiante.getApellidos())", target = "nombreCompleto")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.infraestructure.delivery.dto.EstudianteResponse toEstudianteResponse(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.domain.Estudiante estudiante);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.demo.infraestructure.delivery.dto.EstudianteResponse> toListaEstudiantesResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.demo.core.domain.Estudiante> estudianes);
}