package com.uco.movimiento.model.util;

import java.util.Date;

import com.uco.movimiento.model.businessexception.BusinessException;


public class Validator {

    public static void validarFechaNula(Date fecha, String mensaje) throws BusinessException {
        if(fecha == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarFechaVacia(Date fecha, String mensaje) throws BusinessException {
        if("".equals(fecha)){
            throw new BusinessException(mensaje);
        }
    }


    public static void validarDocumentoNulo(String documento, String mensaje) throws BusinessException {
        if(documento == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarDocumentoVacio(String documento, String mensaje) throws BusinessException {
        if("".equals(documento)){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarTipoDocumentoVacio(String tipoDocumento, String mensaje) throws BusinessException {
        if("".equals(tipoDocumento)){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarTipoDocumentoNulo(String tipoDocumento, String mensaje) throws BusinessException {
        if(tipoDocumento == null){
            throw new BusinessException(mensaje);
        }
    }

    public static void ValidarTipoDocumentoCedula(String tipoDocumento, String mensaje) throws BusinessException{
        if( tipoDocumento!= "CC"){
            throw new BusinessException(mensaje);
        }
    }

    public static void validarCadenaVacia(String cadena, String mensaje) throws BusinessException {
        if(cadena == null || "".equals(cadena)){
            throw new BusinessException(mensaje);
        }
    }
}
