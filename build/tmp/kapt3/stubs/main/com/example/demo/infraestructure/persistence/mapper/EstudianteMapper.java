package com.example.demo.infraestructure.persistence.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&\u00a8\u0006\f"}, d2 = {"Lcom/example/demo/infraestructure/persistence/mapper/EstudianteMapper;", "", "toEstudiante", "Lcom/example/demo/core/domain/Estudiante;", "estudianteEntity", "Lcom/example/demo/infraestructure/persistence/entity/EstudianteEntity;", "toEstudianteEntity", "estudiante", "toListaEstudiante", "", "estudiantes", "toListaEstudianteEntity", "crean.arquitecture"})
@org.mapstruct.Mapper(componentModel = "spring")
public abstract interface EstudianteMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.core.domain.Estudiante toEstudiante(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.persistence.entity.EstudianteEntity estudianteEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.demo.infraestructure.persistence.entity.EstudianteEntity toEstudianteEntity(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.domain.Estudiante estudiante);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.demo.core.domain.Estudiante> toListaEstudiante(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.demo.infraestructure.persistence.entity.EstudianteEntity> estudiantes);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.demo.infraestructure.persistence.entity.EstudianteEntity> toListaEstudianteEntity(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.demo.core.domain.Estudiante> estudiantes);
}