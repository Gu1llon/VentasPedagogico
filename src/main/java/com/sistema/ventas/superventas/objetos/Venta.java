package com.sistema.ventas.superventas.objetos;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Venta")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	private int ventaId;
//	private List<Integer> articulosId;
	private String detallesVenta;
	private LocalDateTime fechVenta;
	private int cantidad;
	private int cliente;
	private int usrMod;
	private int usrCrea;
	private LocalDateTime fechCreacion;
	private LocalDateTime fechMod;
	private int estado;
	private int montoVenta;

	

	public Venta(int ventaId, List<Integer> articulosId, String nombre, LocalDateTime fechVenta, int cantidad,
			int cliente, int usrMod, int usrCrea, LocalDateTime fechCreacion, LocalDateTime fechMod, int estado, int montoVenta) {
		super();
		this.ventaId = ventaId;
//		this.articulosId = articulosId;
		this.detallesVenta = nombre;
		this.fechVenta = fechVenta;
		this.cantidad = cantidad;
		this.cliente = cliente;
		this.usrMod = usrMod;
		this.usrCrea = usrCrea;
		this.fechCreacion = fechCreacion;
		this.fechMod = fechMod;
		this.estado = estado;
		this.montoVenta= montoVenta;
		
	}



	public int getVentaId() {
		return ventaId;
	}



	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}


//
//	public List<Integer> getArticulosId() {
//		return articulosId;
//	}
//
//
//
//	public void setArticulosId(List<Integer> articulosId) {
//		this.articulosId = articulosId;
//	}



	public String getDetallesVenta() {
		return detallesVenta;
	}



	public void setDetallesVenta(String detallesVenta) {
		this.detallesVenta = detallesVenta;
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



	public int getEstado() {
		return estado;
	}



	public void setEstado(int estado) {
		this.estado = estado;
	}



	public int getMontoVenta() {
		return montoVenta;
	}



	public void setMontoVenta(int montoVenta) {
		this.montoVenta = montoVenta;
	}



	@Override
	public String toString() {
		return "Venta [ventaId=" + ventaId + ","
//				+ " articulosId=" + articulosId + ","
						+ " detallesVenta=" + detallesVenta
				+ ", fechVenta=" + fechVenta + ", cantidad=" + cantidad + ", cliente=" + cliente + ", usrMod=" + usrMod
				+ ", usrCrea=" + usrCrea + ", fechCreacion=" + fechCreacion + ", fechMod=" + fechMod + ", estado="
				+ estado + ", montoVenta=" + montoVenta + "]";
	}




	
	
}
