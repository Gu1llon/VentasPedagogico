package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

public class Cliente {
	private String nombre;
	private String apellido;
	private String empresa;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;

	public Cliente(String nombre, String apellido, String empresa, LocalDateTime fechCreacion, LocalDateTime fechMod) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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

	public String toString() {
		return "cliente [nombre=" + nombre + ", apellido=" + apellido + ", empresa=" + empresa + ", fechCreacion="
				+ fechCreacion + ", fechMod=" + fechMod + "]";
	}

}
