package com.uco.movimiento.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PropietarioDTO {

	  	private String nombrePropietario;
	    private String correo;
	    private int identificacion;
	    private Date fechaInicio;
	    private String direccion;
	    private String telefono;
	    
	    
		public String getNombrePropietario() {
			return nombrePropietario;
		}
		public void setNombrePropietario(String nombrePropietario) {
			this.nombrePropietario = nombrePropietario;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public int getIdentificacion() {
			return identificacion;
		}
		public void setIdentificacion(int identificacion) {
			this.identificacion = identificacion;
		}
		public Date getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
	    
	    
}
