package com.example.demoSonarQube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSonarQubeApplication {
	private static String str = "Hello World";
	public String getGreeting() {
		return str;
	}
	public String getData(){return str;}
	public String getData1(){return str;}
	public String getData2(){return str;}
	public static void main(String[] args) {

		SpringApplication.run(DemoSonarQubeApplication.class, args);
	}
}
