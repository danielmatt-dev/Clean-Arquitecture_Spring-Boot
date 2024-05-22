package org.example.shared.excepciones;


public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }

}
