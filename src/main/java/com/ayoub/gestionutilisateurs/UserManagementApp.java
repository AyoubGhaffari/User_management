package com.ayoub.gestionutilisateurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.ayoub.usermanagement"})
public class UserManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApp.class, args);
	}

}
