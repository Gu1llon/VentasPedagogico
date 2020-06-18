package com.sistema.ventas.superventas.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.ventas.superventas.model.Articulo;
import com.sistema.ventas.superventas.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Integer> {


}
