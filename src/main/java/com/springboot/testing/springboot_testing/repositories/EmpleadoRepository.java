package com.springboot.testing.springboot_testing.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.testing.springboot_testing.entities.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

}
