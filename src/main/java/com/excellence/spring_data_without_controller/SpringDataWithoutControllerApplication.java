package com.excellence.spring_data_without_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataWithoutControllerApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataWithoutControllerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book = new Book();
		book.setTitle("First Book");
		book.setContent("This is content of the First Book");
		Book book1 = new Book();
		book1.setTitle("Second Book");
		book1.setContent("This is content of the Second Book");

		this.bookRepository.save(book);
		this.bookRepository.save(book1);
	}

}
