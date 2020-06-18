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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sistema.ventas.superventas.model.Articulo;
import com.sistema.ventas.superventas.model.Cliente;
import com.sistema.ventas.superventas.model.User;
import com.sistema.ventas.superventas.repository.ClienteRepository;
import com.sistema.ventas.superventas.repository.UserRepository;

@Controller
@RequestMapping(path = "/cliente/")
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;


	
	@PostMapping(value = "save")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
		cliente.setFechCreacion(LocalDateTime.now());
		Cliente obj = clienteRepository.save(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value = "delete")
	public ResponseEntity<Cliente> delete(@RequestBody Cliente cliente) {
		
		Optional<Cliente> client = clienteRepository.findById(cliente.getClienteId());
		if (!client.isPresent()) {
			return new ResponseEntity<Cliente>(cliente, HttpStatus.BAD_REQUEST);
		
		}
		else {
			Cliente clientedlet = client.get();
		clientedlet.setFechMod(LocalDateTime.now());
		Cliente obj = clienteRepository.save(clientedlet);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}
	}
	

	@PostMapping(value = "update")
	public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {

		
		validaciondatos(cliente);
		
		Optional<Cliente> client = clienteRepository.findById(cliente.getClienteId());
		if (!client.isPresent()) {
			return new ResponseEntity<Cliente>(cliente, HttpStatus.BAD_REQUEST);
		
		}
		else {
			cliente.setFechMod(LocalDateTime.now());
		Cliente obj = clienteRepository.save(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
		}
	}
	
private static String validaciondatos(Cliente cliente) {
		// TODO Auto-generated method stub
		if(cliente.getNombre()== null || cliente.getApellido()==null || cliente.getEmpresa()== null) {
			return "sdsdsd";
		}
		return null;
	}
//
//
//
//
////	@PostMapping(path = "/delete")
////	public @ResponseBody String deleteUser(@RequestParam int id) {
////
////		Optional<User> usuario = userRepository.findById(id);
////		if (!usuario.isPresent()) {
////			return "el usuario no existe";
////
////		}
////
////		User eliminado = usuario.get();
////		eliminado.setEstado(2);
////		eliminado.setFechMod(LocalDateTime.now());
////		userRepository.save(eliminado);
////		return "Eliminado con Éxito";
////	}
//
//	// TODO @Nelson
//	// queda pendiente update
//
//	@GetMapping(path = "todos")
//	public @ResponseBody Iterable<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//

}
