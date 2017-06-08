package com.codesleek.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct

@SpringBootApplication
class ExampleApplication {

	@Autowired
	private ExampleProperties properties

	static void main(String[] args) {
		SpringApplication.run ExampleApplication, args
	}

    @PostConstruct
    void displayProperties() {
        System.out.println(properties.bar)
        System.out.println(properties.foo)
        System.out.println(properties.test.greeting)
    }
}
