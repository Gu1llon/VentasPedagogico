package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ventaId;
	private String nombre;
	private LocalDateTime fechVenta;
	private int cantidad;
	private int cliente;
	private int usrMod;
	private int usrCrea;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;

	public Venta(int ventaId, String nombre, LocalDateTime fechVenta, int cantidad, int cliente, int usrMod, int usrCrea,
			LocalDateTime fechCreacion, LocalDateTime fechMod) {
		this.nombre = nombre;
		this.fechVenta = fechVenta;
		this.cantidad = cantidad;
		this.cliente = cliente;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.ventaId = ventaId;
		
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechVenta() {
		return fechVenta;
	}

	public void setFechVenta(LocalDateTime fechVenta) {
		this.fechVenta = fechVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
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
		return "Venta [ventaId=" + ventaId + ",  nombre=" + nombre + ", fechVenta=" + fechVenta + ", cantidad=" + cantidad + ", cliente="
				+ cliente + ", usrMod=" + usrMod + ", usrCrea=" + usrCrea + ", fechCreacion=" + fechCreacion
				+ ", fechMod=" + fechMod + "]";
	}

}
