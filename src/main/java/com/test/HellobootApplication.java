package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HellobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}

	@RestController
	static final class mycontroller {
		@GetMapping("/")
		String hello() {
			return "Hello";
		}

		@PostMapping("/add")
		public String add(@RequestBody String s) {
			System.out.println(s);
			System.out.println(s);
			return "done";
		}
	}
}
