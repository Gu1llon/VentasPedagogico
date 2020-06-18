package com.sistema.ventas.superventas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table(name="Usuario")

@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq" )
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private Integer estado;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
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

}
