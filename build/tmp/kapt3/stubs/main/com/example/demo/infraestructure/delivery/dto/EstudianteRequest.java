package com.example.demo.infraestructure.delivery.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/demo/infraestructure/delivery/dto/EstudianteRequest;", "", "nombre", "", "apellidos", "edad", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getApellidos", "()Ljava/lang/String;", "setApellidos", "(Ljava/lang/String;)V", "getEdad", "()I", "setEdad", "(I)V", "getNombre", "setNombre", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "crean.arquitecture"})
public final class EstudianteRequest {
    @jakarta.validation.constraints.NotBlank(message = "El campo nombre no puede ser estar vac\u00edo")
    @org.hibernate.validator.constraints.Length(max = 50, message = "El campo nombre no puede tener m\u00e1s de 50 caracteres")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nombre;
    @jakarta.validation.constraints.NotBlank(message = "El campo apellidos no puede ser estar vac\u00edo")
    @org.hibernate.validator.constraints.Length(max = 100, message = "El campo apellidos no puede tener m\u00e1s de 100 caracteres")
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apellidos;
    @jakarta.validation.constraints.Min(value = 0L, message = "El campo edad debe ser mayor a cero")
    @jakarta.validation.constraints.NotNull(message = "El campo apellidos no puede ser estar vac\u00edo")
    private int edad;
    
    public EstudianteRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String apellidos, int edad) {
        super();
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
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.demo.infraestructure.delivery.dto.EstudianteRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String nombre, @org.jetbrains.annotations.NotNull()
    java.lang.String apellidos, int edad) {
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