package com.example.demo.core.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\bJ\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0004H\u00c6\u0003J\t\u0010%\u001a\u00020\u0004H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0004H\u00c6\u0003JE\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010-\u001a\u00020\u0004J\t\u0010.\u001a\u00020\bH\u00d6\u0001J\t\u0010/\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010\u00a8\u00060"}, d2 = {"Lcom/example/demo/core/domain/Estudiante;", "", "()V", "matricula", "", "nombre", "apellidos", "edad", "", "carrera", "Lcom/example/demo/shared/enums/Carrera;", "grupo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/example/demo/shared/enums/Carrera;Ljava/lang/String;)V", "getApellidos", "()Ljava/lang/String;", "setApellidos", "(Ljava/lang/String;)V", "getCarrera", "()Lcom/example/demo/shared/enums/Carrera;", "setCarrera", "(Lcom/example/demo/shared/enums/Carrera;)V", "getEdad", "()I", "setEdad", "(I)V", "getGrupo", "setGrupo", "getMatricula", "setMatricula", "getNombre", "setNombre", "asignarGrupo", "semestre", "asignarGrupoDos", "asignarGrupoDry", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "generarMatricula", "hashCode", "toString", "crean.arquitecture"})
public final class Estudiante {
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
    
    public Estudiante(@org.jetbrains.annotations.NotNull()
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
    
    public Estudiante() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String generarMatricula() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asignarGrupo(int semestre) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asignarGrupoDos(int semestre) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asignarGrupoDry(int semestre) {
        return null;
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
    public final com.example.demo.core.domain.Estudiante copy(@org.jetbrains.annotations.NotNull()
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