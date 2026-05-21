package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

           System.out.println("Hola Mundo");
		Cliente cliente = new Cliente(1,"1750042853","alejandro","Paz","Quito","0985524302","damianpazn@gmail.com"
		);

		System.out.println(cliente.toString());




	}
}
