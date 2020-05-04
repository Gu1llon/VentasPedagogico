package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

public class Estado {
	private String nombre;
	private int usrMod;
	private int usrCrea;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	
	public Estado(String nombre, int usrMod, int usrCrea, LocalDateTime fechCreacion, LocalDateTime fechMod) {
		super();
		this.nombre = nombre;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
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
		return "Estado [nombre=" + nombre + ", usrMod=" + usrMod + ", usrCrea=" + usrCrea + ", fechCreacion="
				+ fechCreacion + ", fechMod=" + fechMod + "]";
	}
	
	
	

}
