package com.sistema.ventas.superventas.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.ventas.superventas.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}
