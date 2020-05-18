package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int estadoId;
	private String nombre;
	private int usrMod;
	private int usrCrea;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	
	public Estado(int estadoId, String nombre, int usrMod, int usrCrea, LocalDateTime fechCreacion, LocalDateTime fechMod) {
		this.nombre = nombre;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.estadoId= estadoId;
		
		
	}
	
	public int getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUsrMod() {
		return usrMod;
	}

	public void setUsrMod(int usrMod) {
		this.usrMod = usrMod;
	}

	public int getUsrCrea() {
		return usrCrea;
	}

	public void setUsrCrea(int usrCrea) {
		this.usrCrea = usrCrea;
	}

	public LocalDateTime getFechCreacion() {
		return fechCreacion;
	}

	public void setFechCreacion(LocalDateTime fechCreacion) {
		this.fechCreacion = fechCreacion;
	}

	public LocalDateTime getFechMod() {
		return fechMod;
	}

	public void setFechMod(LocalDateTime fechMod) {
		this.fechMod = fechMod;
	}

	@Override
	public String toString() {
		return "Estado [estadoId=" + estadoId + ", nombre=" + nombre + ", usrMod=" + usrMod + ", usrCrea=" + usrCrea + ", fechCreacion="
				+ fechCreacion + ", fechMod=" + fechMod + "]";
	}
	
	
	

}
