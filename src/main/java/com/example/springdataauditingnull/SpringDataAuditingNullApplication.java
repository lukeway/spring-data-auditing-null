package com.example.springdataauditingnull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class SpringDataAuditingNullApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataAuditingNullApplication.class, args);
	}
}
