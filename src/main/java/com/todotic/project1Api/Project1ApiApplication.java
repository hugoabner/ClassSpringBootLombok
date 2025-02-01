package com.todotic.project1Api;

import com.todotic.project1Api.entity.Contact;
import com.todotic.project1Api.repository.ContactRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Project1ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1ApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ContactRepository contactRepository) {
		return args -> {
            List<Contact> contacts = Arrays.asList(
                    new Contact("Juan", "juan@gmail.com", LocalDateTime.now()),
                    new Contact("Hugo", "hugo@gmail.com", LocalDateTime.now()),
                    new Contact("Carlos", "carlo@gmail.com", LocalDateTime.now()),
					new Contact("Juan", "juan@gmail.com", LocalDateTime.now()),
					new Contact("Carlos", "carlo@gmail.com", LocalDateTime.now())
            );
            contactRepository.saveAll(contacts);
        };
	}

	@Bean
    ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
