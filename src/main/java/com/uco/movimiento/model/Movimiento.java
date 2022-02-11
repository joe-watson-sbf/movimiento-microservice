package com.uco.movimiento.model;


import java.util.Date;

import com.uco.movimiento.model.businessexception.BusinessException;
import com.uco.movimiento.model.util.Validator;


public class Movimiento {
    private int idMovimiento;
    private int identificacion;
    private String tipoElectrodomestico;
    private String marca;
    private String serial;
    private String observacion;
    private String diagnosticoTecnico;
    private Date fechaEntranda;
    private Date fechaSalida;
    private Propietario propietario;

   
    public Movimiento() {
        super();
    }

    public static class MovimientoBuilder{
    		private int idMovimiento;
    		private int identificacion;
    	    private String tipoElectrodomestico;
    	    private String marca;
    	    private String serial;
    	    private String observacion;
    	    private String diagnosticoTecnico;
    	    private Date fechaEntranda;
    	    private Date fechaSalida;
    	    private Propietario propietario;
    	    

        public MovimientoBuilder setIdMovimiento(int idMovimiento) {
				this.idMovimiento = idMovimiento;
				return this;
			}
			public MovimientoBuilder setTipoElectrodomestico(String tipoElectrodomestico) {
				this.tipoElectrodomestico = tipoElectrodomestico;
				return this;
			}
			public MovimientoBuilder setIdentificacion(int identificacion) {
				this.identificacion = identificacion;
				return this;
			}
			public MovimientoBuilder setMarca(String marca) {
				this.marca = marca;
				return this;
			}
			public MovimientoBuilder setSerial(String serial) {
				this.serial = serial;
				return this;
			}
			public MovimientoBuilder setObservacion(String observacion) {
				this.observacion = observacion;
				return this;
			}
			public MovimientoBuilder setDiagnosticoTecnico(String diagnosticoTecnico) {
				this.diagnosticoTecnico = diagnosticoTecnico;
				return this;
			}
			public MovimientoBuilder setFechaEntranda(Date fechaEntranda) {
				this.fechaEntranda = fechaEntranda;
				return this;
			}
			public MovimientoBuilder setFechaSalida(Date fechaSalida) {
				this.fechaSalida = fechaSalida;
				return this;
			}
			public MovimientoBuilder setPropietario(Propietario propietario) {
				this.propietario = propietario;
				return this;
			}
			

		public Movimiento build() throws BusinessException {
            Movimiento movimiento = new Movimiento();
            movimiento.idMovimiento = this.idMovimiento;
            movimiento.tipoElectrodomestico = this.tipoElectrodomestico;
            movimiento.marca = this.marca;
            movimiento.serial = this.serial;
            movimiento.observacion = this.observacion;
            movimiento.diagnosticoTecnico = this.diagnosticoTecnico;
            movimiento.fechaEntranda = this.fechaEntranda;
            movimiento.fechaSalida = this.fechaSalida;
            movimiento.identificacion = this.identificacion;
            movimiento.propietario = this.propietario;
            
            return movimiento;
        }

    }

}
