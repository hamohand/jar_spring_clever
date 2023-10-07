package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
public class HelloworldApplication {

	@Value("${TARGET:Muhend}")
	String target;

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			//return "Hello " + target + "!";
			//return "Hello " + target + " ! Jar-CleverCloud, " + "le 05/10 10:30";
			return "Hello " + target + " ! Gcloud, " + "le 07/10 16:30";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
