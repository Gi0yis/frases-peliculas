package com.gioyisfrases.frases;

import com.gioyisfrases.frases.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrasesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FrasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();

		principal.muestraMenu();
	}
}
