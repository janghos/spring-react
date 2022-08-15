package com.example.boardback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BoardBackApplication {

	public static void main(String[] args) {

		SpringApplication.run(BoardBackApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Worrld spring";
	}
}
