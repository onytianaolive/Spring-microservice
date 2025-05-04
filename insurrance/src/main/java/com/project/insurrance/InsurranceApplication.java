package com.project.insurrance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class InsurranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurranceApplication.class, args);
	}

}
