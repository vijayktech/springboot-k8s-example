package com.techgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootK8sExampleApplication {

	@GetMapping("/")
	public String getMessage(){
		return "Service is deployed to Kubernetes!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sExampleApplication.class, args);
	}

}
