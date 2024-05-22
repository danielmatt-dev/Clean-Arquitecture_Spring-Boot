package com.example.demo.shared.excepciones

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseBody
@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException(mensaje : String) : RuntimeException(mensaje)