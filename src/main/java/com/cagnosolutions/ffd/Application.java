package com.cagnosolutions.ffd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

//@EnableJpaRepositories
@SpringBootApplication
public class Application {
	public static void main(String... args) {
		SpringApplication.run(Application.class, args);
	}
}