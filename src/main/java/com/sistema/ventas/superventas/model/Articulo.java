package com.sistema.ventas.superventas.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Articulo")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	private int articuloId;
	private String nombre;
	private String marca;
	private int cantidad;
	private int estado;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	private int usrMod;
	private int usrCrea;
	
	
	

	public int getArticuloId() {
		return articuloId;
	}

	public void setArticuloId(int articuloId) {
		this.articuloId = articuloId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
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

	public int getUsrMod() {
		return usrMod;
	}

	public void setUsrMod(int usrMod) {
		this.usrMod = usrMod;
	}

	public Integer getUsrCrea() {
		return usrCrea;
	}

	public void setUsrCrea(int usrCrea) {
		this.usrCrea = usrCrea;
	}

	public Articulo() {
		
	}
	
	public Articulo(int articuloId, String nombre, String marca, int cantidad, int estado, LocalDateTime fechCreacion,
			LocalDateTime fechMod, int usrMod, int usrCrea) {

		this.articuloId = articuloId;
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.estado = estado;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
	}
	
	
	
	@Override
	public String toString() {
		return "Articulo [articuloId=" + articuloId + ", nombre=" + nombre + ", marca=" + marca + ", cantidad="
				+ cantidad + ", estado=" + estado + ", fechCreacion=" + fechCreacion + ", fechMod=" + fechMod
				+ ", usrMod=" + usrMod + ", usrCrea=" + usrCrea + "]";
	}


	
	

}
