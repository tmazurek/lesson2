package com.example.lesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lesson2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson2Application.class, args);
		Greeting greet = new Greeting(1, "straczka");
		GreetingTest greettest = new GreetingTest(1, "dupsko");
	}

	@GetMapping("/dupa")
	public String dupa(@RequestParam(value = "name", defaultValue = "defaultValue") String name) {
		return "hello " + name;

	}

	@GetMapping("/")
	public String root() {
		return "heloo root";

	}

	@GetMapping("/sraka")
	public String sraka() {
		return "heloo sraka";
	}
}
