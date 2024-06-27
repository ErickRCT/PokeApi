package com.ejerciciopoke.pokiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PokiapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokiapiApplication.class, args);
	}

}
