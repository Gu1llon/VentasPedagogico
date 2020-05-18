package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

public class Categoria {
	private int categoriaId;
	private String nombre;
	private int estado;
	private int usrMod;
	private int usrCrea;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	
	public Categoria(String nombre, int estado, int usrMod, int usrCrea, LocalDateTime fechCreacion,
			LocalDateTime fechMod) {
		this.nombre = nombre;
		this.estado = estado;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
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
		return "Categoria [nombre=" + nombre + ", estado=" + estado + ", usrMod=" + usrMod + ", usrCrea=" + usrCrea
				+ ", fechCreacion=" + fechCreacion + ", fechMod=" + fechMod + "]";
	}
	
	
}
