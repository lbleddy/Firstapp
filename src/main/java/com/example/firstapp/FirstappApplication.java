package com.example.firstapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FirstappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}

	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM userdata "
	}

}
