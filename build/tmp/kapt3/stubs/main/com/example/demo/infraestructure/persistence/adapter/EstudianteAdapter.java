package com.example.demo.infraestructure.persistence.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/demo/infraestructure/persistence/adapter/EstudianteAdapter;", "Lcom/example/demo/core/port/EstudianteRepository;", "estudianteDao", "Lcom/example/demo/infraestructure/persistence/dao/EstudianteDao;", "mapper", "Lcom/example/demo/infraestructure/persistence/mapper/EstudianteMapper;", "(Lcom/example/demo/infraestructure/persistence/dao/EstudianteDao;Lcom/example/demo/infraestructure/persistence/mapper/EstudianteMapper;)V", "buscarPorMatricula", "Larrow/core/Either;", "Lcom/example/demo/shared/excepciones/ResourceNotFoundException;", "Lcom/example/demo/core/domain/Estudiante;", "matricula", "", "guardarEstudiante", "estudiante", "crean.arquitecture"})
public final class EstudianteAdapter implements com.example.demo.core.port.EstudianteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.infraestructure.persistence.dao.EstudianteDao estudianteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.demo.infraestructure.persistence.mapper.EstudianteMapper mapper = null;
    
    public EstudianteAdapter(@org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.persistence.dao.EstudianteDao estudianteDao, @org.jetbrains.annotations.NotNull()
    com.example.demo.infraestructure.persistence.mapper.EstudianteMapper mapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public arrow.core.Either<com.example.demo.shared.excepciones.ResourceNotFoundException, com.example.demo.core.domain.Estudiante> buscarPorMatricula(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.demo.core.domain.Estudiante guardarEstudiante(@org.jetbrains.annotations.NotNull()
    com.example.demo.core.domain.Estudiante estudiante) {
        return null;
    }
}