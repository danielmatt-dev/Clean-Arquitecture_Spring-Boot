package com.example.demo.shared.excepciones;

@org.springframework.web.bind.annotation.ResponseBody()
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NOT_FOUND)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/demo/shared/excepciones/ResourceNotFoundException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "mensaje", "", "(Ljava/lang/String;)V", "crean.arquitecture"})
public final class ResourceNotFoundException extends java.lang.RuntimeException {
    
    public ResourceNotFoundException(@org.jetbrains.annotations.NotNull()
    java.lang.String mensaje) {
        super();
    }
}