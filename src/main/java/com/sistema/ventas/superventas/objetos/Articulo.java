package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

public class Articulo {
	private int categoriaId;
	private String nombre;
	private String marca;
	private int cantidad;
	private int estado;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	private int usrMod;
	private int usrCrea;
	
	public Articulo() {
		
	}
	
	public Articulo(int categoriaId, String nombre, String marca, int cantidad, int estado, LocalDateTime fechCreacion,
			LocalDateTime fechMod, int usrMod, int usrCrea) {
		this.categoriaId = categoriaId;
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.estado = estado;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
	}
	
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
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
	public int getUsrCrea() {
		return usrCrea;
	}
	public void setUsrCrea(int usrCrea) {
		this.usrCrea = usrCrea;
	}
	
	

}
