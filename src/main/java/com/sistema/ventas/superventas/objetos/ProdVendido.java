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
@Table(name="ProdVendido")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class ProdVendido {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
	private int artiId;

	public ProdVendido(int artiId) {
		super();
		this.artiId = artiId;
	}

	public int getArtiId() {
		return artiId;
	}

	public void setArtiId(int artiId) {
		this.artiId = artiId;
	}

	@Override
	public String toString() {
		return "ProdVendido [artiId=" + artiId + "]";
	}
	
	

	
}
