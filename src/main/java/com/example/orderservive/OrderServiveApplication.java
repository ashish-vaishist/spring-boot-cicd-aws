package com.example.orderservive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class OrderServiveApplication extends SpringBootServletInitializer {



	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

	return 	builder.sources(OrderServiveApplication.class);
	//	return super.configure(builder);
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiveApplication.class, args);

	}
}
