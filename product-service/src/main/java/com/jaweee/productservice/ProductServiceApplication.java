package com.jaweee.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}


//To run MongoDB (i.e. the mongod process) as a macOS service, run:
//
//	brew services start mongodb-community@6.0
//
//	To stop a mongod running as a macOS service, use the following command as needed:
//
//	brew services stop mongodb-community@6.0
