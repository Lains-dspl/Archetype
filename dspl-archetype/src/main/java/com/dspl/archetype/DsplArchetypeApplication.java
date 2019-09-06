package com.dspl.archetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.dspl.app.core.*" })
@EnableMongoRepositories(basePackages = { "com.dspl.app.core.*" })
@EntityScan(basePackages = { "com.dspl.app.core.*" })
public class DsplArchetypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsplArchetypeApplication.class, args);
	}

}
