package com.sistema.ventas.superventas.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {


		@GetMapping("/hola")
		public String greeting(@RequestParam(value = "name", defaultValue = "Nelsito") String name) {
			return "Hola " + name+" es un placer tenerte por acá!!!";
		}
	}
