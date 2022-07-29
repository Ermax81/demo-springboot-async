package com.example.async.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

// SRC: https://www.youtube.com/watch?v=K3XWqkseO2A
// @Async in Spring Boot | Code Debugger

@SpringBootApplication
@EnableAsync
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
