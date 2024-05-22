package com.example.demo.infraestructure.persistence.entity;

@jakarta.persistence.Entity()
@jakarta.persistence.Table(name = "estudiantes")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0007H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/example/demo/infraestructure/persistence/entity/EstudianteEntity;", "", "matricula", "", "nombre", "apellidos", "edad", "", "carrera", "Lcom/example/demo/shared/enums/Carrera;", "grupo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/example/demo/shared/enums/Carrera;Ljava/lang/String;)V", "getApellidos", "()Ljava/lang/String;", "setApellidos", "(Ljava/lang/String;)V", "getCarrera", "()Lcom/example/demo/shared/enums/Carrera;", "setCarrera", "(Lcom/example/demo/shared/enums/Carrera;)V", "getEdad", "()I", "setEdad", "(I)V", "getGrupo", "setGrupo", "getMatricula", "setMatricula", "getNombre", "setNombre", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "crean.arquitecture"})
public final class EstudianteEntity {
    @jakarta.persistence.Id()
    @org.jetbrains.annotations.NotNull()
    private java.lang.String matricula;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nombre;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apellidos;
    private int edad;
    @org.jetbrains.annotations.NotNull()
    private com.example.demo.shared.enums.Carrera carrera;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String grupo;
    
    public EstudianteEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula, @org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String apellidos, int edad, @org.jetbrains.annotations.NotNull()
    com.example.demo.shared.enums.Carrera carrera, @org.jetbrains.annotations.NotNull()
    java.lang.String grupo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMatricula() {
        return null;
    }
    
    public final void setMatricula(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombre() {
        return null;
    }
    
    public final void setNombre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApellidos() {
        return null;
    }
    
    public final void setApellidos(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getEdad() {
        return 0;
    }
    
    public final void setEdad(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.shared.enums.Carrera getCarrera() {
        return null;
    }
    
    public final void setCarrera(@org.jetbrains.annotations.NotNull()
    com.example.demo.shared.enums.Carrera p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrupo() {
        return null;
    }
    
    public final void setGrupo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.shared.enums.Carrera component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.infraestructure.persistence.entity.EstudianteEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String matricula, @org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String apellidos, int edad, @org.jetbrains.annotations.NotNull()
    com.example.demo.shared.enums.Carrera carrera, @org.jetbrains.annotations.NotNull()
    java.lang.String grupo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}