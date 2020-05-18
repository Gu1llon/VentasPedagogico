package com.sistema.ventas.superventas.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.ventas.superventas.model.User;
import com.sistema.ventas.superventas.objetos.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo, Integer> {


}
