package com.ram.AppPostgress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.ram")
@SpringBootApplication
@EnableJpaRepositories("com.ram")
@EntityScan("com.ram.model")
public class JpaPostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaPostgressApplication.class, args);
	}

}
