package com.uco.movimiento.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name = "MOVIMIENTO")
public class MovimientoEntity {

    @Id
    @GeneratedValue
    @Column( name = "idMovimiento")
    private int idMovimiento;
    @Column( name = "identificacion")
    private int identificacion;
    @Column( name = "tipoElectrodomestico")
    private String tipoElectrodomestico;
    @Column( name = "marca")
    private String marca;
    @Column( name = "serial")
    private String serial;
    @Column( name = "observacion")
    private String observacion;
    @Column( name = "diagnosticoTecnico")
    private String diagnosticoTecnico;
    @Column( name = "fechaIngreso")
    private Date fechaIngreso;
    @Column( name = "fechaSalida")
    private Date fechaSalida;
    
    
    public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public MovimientoEntity() {
		super();
	}
	public MovimientoEntity(int idMovimiento, String tipoElectrodomestico, String marca, String serial, String observacion,
			String diagnosticoTecnico, int identificacion) {
		super();
		this.idMovimiento = idMovimiento;
		this.tipoElectrodomestico = tipoElectrodomestico;
		this.marca = marca;
		this.serial = serial;
		this.observacion = observacion;
		this.diagnosticoTecnico = diagnosticoTecnico;
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
	public void setObservacion(String numeroDocumento) {
		this.observacion = numeroDocumento;
	}
	public String getDiagnosticoTecnico() {
		return diagnosticoTecnico;
	}
	public void setDiagnosticoTecnico(String diagnosticoTecnico) {
		this.diagnosticoTecnico = diagnosticoTecnico;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
    
    

}
