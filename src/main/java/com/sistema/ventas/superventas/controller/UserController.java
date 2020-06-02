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

import com.sistema.ventas.superventas.model.User;
import com.sistema.ventas.superventas.repository.UserRepository;

@Controller
@RequestMapping(path = "/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String nombre, @RequestParam String apellido,
			@RequestParam String email) {

		Iterable<User> usuarios = userRepository.findAll();
		for (User user : usuarios) {
			if (email.equals(user.getEmail())) {
				return "El correo ingresado ya está en uso";
			}
		}

		User n = new User();
		n.setNombre(nombre);
		n.setApellido(apellido);
		n.setEmail(email);
		n.setEstado(1);
		n.setFechCreacion(LocalDateTime.now());
		userRepository.save(n);
		return "Guardado con Éxito";
	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<User> save(@RequestBody User user) {
		user.setEstado(1);
		user.setFechCreacion(LocalDateTime.now());
		User obj = userRepository.save(user);
		return new ResponseEntity<User>(obj, HttpStatus.OK);
	}

	@PostMapping(path = "/delete")
	public @ResponseBody String deleteUser(@RequestParam int id) {

		Optional<User> usuario = userRepository.findById(id);
		if (!usuario.isPresent()) {
			return "el usuario no existe";

		}

		User eliminado = usuario.get();
		eliminado.setEstado(2);
		eliminado.setFechMod(LocalDateTime.now());
		userRepository.save(eliminado);
		return "Eliminado con Éxito";
	}

	// TODO @Nelson
	// agregar delete(logico) y update

	@GetMapping(path = "/todos")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping(path = "/todos_activos")
	public @ResponseBody Iterable<User> getAllUsersActivos() {
		Iterable<User> usuarios = userRepository.findAll();

		List<User> result = new ArrayList<>();
		List<User> listaSalida = new ArrayList<>();
		usuarios.forEach(result::add);

		for (User user : result) {
			if (null != user.getEstado() && user.getEstado().equals(1)) {
				listaSalida.add(user);
			}
		}
		return listaSalida;
	}
}
