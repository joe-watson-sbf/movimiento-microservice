package com.uco.movimiento.model.businessexception;

public class PersonaNoExisteException extends RuntimeException {
    public PersonaNoExisteException(String mensaje){
        super(mensaje);
    }
}