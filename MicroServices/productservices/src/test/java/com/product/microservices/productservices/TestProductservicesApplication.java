package com.product.microservices.productservices;

import org.springframework.boot.SpringApplication;

public class TestProductservicesApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductservicesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
