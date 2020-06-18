package com.sistema.ventas.superventas.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.ventas.superventas.model.Articulo;
import com.sistema.ventas.superventas.objetos.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Integer> {


}
