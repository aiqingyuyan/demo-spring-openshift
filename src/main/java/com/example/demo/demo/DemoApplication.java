package com.example.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@SpringBootApplication
public class DemoApplication {
	public record DemoResponse (String message) {}

	@GetMapping("/hello")
	public ResponseEntity<DemoResponse> hello() {
		return ResponseEntity.of(Optional.of(new DemoResponse("Greetings!")));
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
