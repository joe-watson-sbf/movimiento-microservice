package com.uco.persona.command;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.uco.movimiento.model.Propietario;


@Component
public class MovimientoCommand {

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
    
	public MovimientoCommand() {
		super();
	}
	public MovimientoCommand(int idMovimiento, String tipoElectrodomestico, String marca, String serial, String observacion,
			String diagnosticotecnico, Date fechaEntrada, Date fechaSalida, int identificacion, Propietario propietario) {
		super();
		this.idMovimiento = idMovimiento;
		this.tipoElectrodomestico = tipoElectrodomestico;
		this.marca = marca;
		this.serial = serial;
		this.observacion = observacion;
		this.diagnosticoTecnico = diagnosticotecnico;
		this.fechaEntranda =fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.identificacion =identificacion;
		this.propietario = propietario;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public String getTipoElectrodomestico() {
		return tipoElectrodomestico;
	}
	public void setTipoElectrodomestico(String tipoElectrodomestico) {
		this.tipoElectrodomestico = tipoElectrodomestico;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getDiagnosticoTecnico() {
		return diagnosticoTecnico;
	}
	public void setDiagnosticoTecnico(String diagnosticoTecnico) {
		this.diagnosticoTecnico = diagnosticoTecnico;
	}
	public Date getFechaEntranda() {
		return fechaEntranda;
	}
	public void setFechaEntranda(Date fechaEntranda) {
		this.fechaEntranda = fechaEntranda;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

    
    
}
