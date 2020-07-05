package com.sistema.ventas.superventas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Cliente")
	
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)



public class Cliente {
	@Id
	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	private int clienteId;
	private String nombre;
	private String apellido;
	private String empresa;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	private int estado;

	public Cliente(int clienteId, String nombre, String apellido, String empresa, LocalDateTime fechCreacion, LocalDateTime fechMod, int estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.clienteId=clienteId;
		this.estado = estado;
		
		
		
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [clienteId=" + clienteId + ", nombre=" + nombre + ", apellido=" + apellido + ", empresa="
				+ empresa + ", fechCreacion=" + fechCreacion + ", fechMod=" + fechMod + ", estado=" + estado + "]";
	}
	
	
	
}