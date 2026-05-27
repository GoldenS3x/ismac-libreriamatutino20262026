package com.distribuida;

import com.distribuida.model.Autor;
import com.distribuida.model.Categoria;
import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
		System.out.println("HOLA MUNDO DESDE SPRING BOOT!!!.....");

		Cliente cliente = new Cliente(1,
				"1725343006",
				"Alejandro",
				"Paz",
				"Tumbaco",
				"1750042853",
				"damian@gmail.com");

		Categoria categoria = new Categoria(1,
				"terror",
				"Libros de literatura y narrativas de terror");


		Autor autor = new Autor(1,
				"Ruben", "Paz",
				"Ecuador",
				"porahi",
				"085524302",
				"ruben@email.com");

	}

}