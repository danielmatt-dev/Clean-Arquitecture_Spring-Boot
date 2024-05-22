package com.example.demo.infraestructure.persistence.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/demo/infraestructure/persistence/dao/EstudianteDao;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/example/demo/infraestructure/persistence/entity/EstudianteEntity;", "", "findByMatricula", "matricula", "crean.arquitecture"})
public abstract interface EstudianteDao extends org.springframework.data.jpa.repository.JpaRepository<com.example.demo.infraestructure.persistence.entity.EstudianteEntity, java.lang.String> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.demo.infraestructure.persistence.entity.EstudianteEntity findByMatricula(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula);
}