package com.sistema.ventas.superventas.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sistema.ventas.superventas.model.Articulo;
import com.sistema.ventas.superventas.objetos.Venta;
import com.sistema.ventas.superventas.repository.ArticuloRepository;
import com.sistema.ventas.superventas.repository.VentaRepository;


@Controller
@RequestMapping(path = "/venta/")
@CrossOrigin("*")
public class VentaController {

	@Autowired
	private VentaRepository ventaRepository;


	
	@PostMapping(value = "save")
	public ResponseEntity<Venta> save(@RequestBody Venta venta) {
		venta.setEstado(1);
		venta.setFechVenta(LocalDateTime.now());
		venta.setFechCreacion(LocalDateTime.now());
		venta.setUsrCrea(1);
		Venta obj = ventaRepository.save(venta);
		return new ResponseEntity<Venta>(obj, HttpStatus.OK);
	}
	
	
	
	
	@PostMapping(value = "delete")
	public ResponseEntity<Venta> delete(@RequestBody Venta venta) {
		
		Optional<Venta> vent = ventaRepository.findById(venta.getVentaId());
		if (!vent.isPresent()) {
			return new ResponseEntity<Venta>(venta, HttpStatus.BAD_REQUEST);
		
		}
		else {
		Venta ventadlet = vent.get();
		venta.setEstado(2);
		ventadlet.setFechMod(LocalDateTime.now());
		Venta obj = ventaRepository.save(ventadlet);
		return new ResponseEntity<Venta>(obj, HttpStatus.OK);
	}
	}
	

	@PostMapping(value = "update")
	public ResponseEntity<Venta> update(@RequestBody Venta venta) {

		
		validaciondatos(venta);
		
		Optional<Venta> vent = ventaRepository.findById(venta.getVentaId());
		if (!vent.isPresent()) {
			return new ResponseEntity<Venta>(venta, HttpStatus.BAD_REQUEST);
		
		}
		else {
			
			venta.setFechMod(LocalDateTime.now());
		Venta obj = ventaRepository.save(venta);
		return new ResponseEntity<Venta>(obj, HttpStatus.OK);
		}
	}
	
private static String validaciondatos(Venta venta) {
		// TODO Auto-generated method stub
		if(venta.getNombre()== null || venta.getCantidad()==0 || venta.getCliente()==0 ) {
			return "sdsdsd";
		}
		return null;
	}






	@GetMapping(path = "todos")
	public @ResponseBody Iterable<Venta> getAllVenta() {
		return ventaRepository.findAll();
	}


}
