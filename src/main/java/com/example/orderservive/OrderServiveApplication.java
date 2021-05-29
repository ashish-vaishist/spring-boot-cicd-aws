package com.example.orderservive;

import io.reactivex.Flowable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class OrderServiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiveApplication.class, args);

		Flowable.just("Hello World!").subscribe(System.out::println);
	}

}
