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

import com.sistema.ventas.superventas.repository.ArticuloRepository;


@Controller
@RequestMapping(path = "/articulo/")
@CrossOrigin("*")
public class ArticuloController {

	@Autowired
	private ArticuloRepository articuloRepository;


	
	@PostMapping(value = "save")
	public ResponseEntity<Articulo> save(@RequestBody Articulo articulo) {
		articulo.setEstado(1);
		articulo.setFechCreacion(LocalDateTime.now());
		articulo.setUsrCrea(1);
		Articulo obj = articuloRepository.save(articulo);
		return new ResponseEntity<Articulo>(obj, HttpStatus.OK);
	}
	
	
	
	
	@PostMapping(value = "delete")
	public ResponseEntity<Articulo> delete(@RequestBody Articulo articulo) {
		
		Optional<Articulo> arti = articuloRepository.findById(articulo.getArticuloId());
		if (!arti.isPresent()) {
			return new ResponseEntity<Articulo>(articulo, HttpStatus.BAD_REQUEST);
		
		}
		else {
		Articulo articulodlet = arti.get();
		articulodlet.setEstado(2);
		articulodlet.setFechMod(LocalDateTime.now());
		Articulo obj = articuloRepository.save(articulodlet);
		return new ResponseEntity<Articulo>(obj, HttpStatus.OK);
	}
	}
	

	@PostMapping(value = "update")
	public ResponseEntity<Articulo> update(@RequestBody Articulo articulo) {

		
	
		
		Optional<Articulo> arti = articuloRepository.findById(articulo.getArticuloId());
		if (!arti.isPresent()) {
			return new ResponseEntity<Articulo>(articulo, HttpStatus.BAD_REQUEST);
		
		}
		else {
			articulo.setFechCreacion(arti.get().getFechCreacion()); //articulo toma valor de fecha que trae arti desde BD
			articulo.setFechMod(LocalDateTime.now());
		Articulo obj = articuloRepository.save(articulo);
		return new ResponseEntity<Articulo>(obj, HttpStatus.OK);
		}
	}
	







	@GetMapping(path = "todos")
	public @ResponseBody Iterable<Articulo> getAllArticulo() {
		return articuloRepository.findAll();
	}


}
