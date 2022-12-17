package com.tutorials.k8s_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sFirstApplication {

	@GetMapping("/message")
	public String displayMessage() {
		return "First Deployed application to Kubernetes with spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(K8sFirstApplication.class, args);
	}

}
