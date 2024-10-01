package com.example.Persona;

import com.example.Persona.entities.Domicilio;
import com.example.Persona.entities.Persona;
import com.example.Persona.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Persona {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private PersonaRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}




	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository) {
		return args -> {
Persona per1 = Persona.builder().
		nombre("Alberto").apellido("Cortez").
		build();

Domicilio dom1 = Domicilio.builder().
		calle("Suipacha").
		numero(239).build();

per1.setDomicilio(dom1);

			personaRepository.save(per1);

			Persona per2 = Persona.builder().
					nombre("Alicia").apellido("Calderon").
					build();

			Domicilio dom2 = Domicilio.builder().
					calle("Lulunta").
					numero(339).build();

			per2.setDomicilio(dom2);


			personaRepository.save(per2);

			List<Persona> recuperadas = personaRepository.findAll();
			System.out.println(recuperadas);

			logger.info("Detalles de la persona: {}", recuperadas);




			Optional<Persona> recuperada = personaRepository.findById(1L);
			System.out.println(recuperada);

			logger.info("Detalles de la persona: {}", recuperada);


			dom1.setCalle("Rodriguezaaaa");

			personaRepository.save(per1);




		};

		};




}
