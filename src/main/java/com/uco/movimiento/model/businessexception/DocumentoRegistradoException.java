package com.uco.movimiento.model.businessexception;

public class DocumentoRegistradoException extends RuntimeException {
    public DocumentoRegistradoException(String mensaje) {
        super(mensaje);
    }
}
