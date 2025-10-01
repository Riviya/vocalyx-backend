package com.example.aisales_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.aisales_backend.entity")  // Add this line
@EnableJpaRepositories("com.example.aisales_backend.repository")  // Add this line
public class AisalesBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(AisalesBackendApplication.class, args);
    }
}
