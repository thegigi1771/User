package com.example.test2;

import com.example.test2.Service.UserService;
import com.example.test2.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Scanner;

@EnableWebFlux
@SpringBootApplication
public class Test2Application {

	public static UserService userService;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Test2Application.class, args);
		userService = context.getBean(UserService.class);
		while (true) {
			start();
		}
	}

	public static void start(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an operation : ");
		String input = scanner.nextLine();
		System.out.println("You entered : " + input);

		switch (input) {
			case "c" -> create();
			case "r" -> read();
			case "u" -> update();
			case "d" -> delete();
		}
	}

	public static void read() {
		Flux<User> allUser = userService.getAllUsers();
		System.out.println(allUser);
	}

	public static void create() {}

	public static void update() {}

	public static void delete() {}
}
