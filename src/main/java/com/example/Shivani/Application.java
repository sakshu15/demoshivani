package com.example.Shivani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Application {
	@GetMapping("/message")
	public String getMessage() {
		return "PixeLab";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
