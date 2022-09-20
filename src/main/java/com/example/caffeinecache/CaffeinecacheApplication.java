package com.example.caffeinecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
public class CaffeinecacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaffeinecacheApplication.class, args);
	}

}
