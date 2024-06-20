package com.springboot.testing.springboot_testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataIntegrityViolationException;

import com.springboot.testing.springboot_testing.entities.Empleado;
import com.springboot.testing.springboot_testing.repositories.EmpleadoRepository;

@SpringBootApplication
public class SpringbootTestingApplication implements CommandLineRunner {

	@Autowired
	EmpleadoRepository empleadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTestingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n");
		Empleado empleado = new Empleado();

		try {
			empleado.setName("Santiago");
			empleado.setSurname("Rubini");
			empleado.setEmail("Santiago@mail.com");
			Empleado empleado2 = empleadoRepository.save(empleado);
			System.out.println(empleado2);
		} catch (DataIntegrityViolationException e) {
			System.out.println("Email repetido"); // Crear una clase restControllerAdvice para manejar mensajes
		}

		System.out.println("\n");
	}

}
