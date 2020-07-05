package com.sistema.ventas.superventas.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.ventas.superventas.objetos.Estado;
import com.sistema.ventas.superventas.repository.EstadoRepository;


@Controller
@RequestMapping(path = "/estado/")
@CrossOrigin("*")
public class EstadoController {

	@Autowired
	private EstadoRepository estadoRepository;
		
	@PostMapping(value = "save")
	public ResponseEntity<Estado> save(@RequestBody Estado estado) {
		estado.setFechCreacion(LocalDateTime.now());
		estado.setUsrCrea(1);
		Estado obj = estadoRepository.save(estado);
		return new ResponseEntity<Estado>(obj, HttpStatus.OK);
	}
	
	
	
	
//	@PostMapping(value = "delete")
//	public ResponseEntity<Estado> delete(@RequestBody Estado estado) {
//		
//		Optional<Estado> obj = estadoRepository.findById(estado.getEstadoId());
//		if (!obj.isPresent()) {
//			return new ResponseEntity<Estado>(estado, HttpStatus.BAD_REQUEST);
//		
//		}
//		else {
//		Estado estadodelet = obj.get();
//		estado.setEstado(2);
//		ventadlet.setFechMod(LocalDateTime.now());
//		Estado obj = estadoController.save(ventadlet);
//		return new ResponseEntity<Estado>(obj, HttpStatus.OK);
////	}
//	}
//	

//	@PostMapping(value = "update")
//	public ResponseEntity<Estado> update(@RequestBody Estado venta) {
//
//		
//		validaciondatos(venta);
//		
//		Optional<Estado> vent = estadoController.findById(venta.getVentaId());
//		if (!vent.isPresent()) {
//			return new ResponseEntity<Estado>(venta, HttpStatus.BAD_REQUEST);
//		
//		}
//		else {
//			
//			venta.setFechMod(LocalDateTime.now());
//		Estado obj = estadoController.save(venta);
//		return new ResponseEntity<Estado>(obj, HttpStatus.OK);
//		}
//	}
//	
//private static String validaciondatos(Estado venta) {
//		// TODO Auto-generated method stub
//		if(venta.getNombre()== null || venta.getCantidad()==0 || venta.getCliente()==0 ) {
//			return "sdsdsd";
//		}
//		return null;
//	}
//
//
//
//
//
//
//	@GetMapping(path = "todos")
//	public @ResponseBody Iterable<Estado> getAllVenta() {
//		return estadoController.findAll();
//	}


}
