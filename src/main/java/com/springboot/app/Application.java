package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		Alien a1 = context.getBean(Alien.class);
		System.out.println(a1.getAge());
		a1.code();


	}
}
