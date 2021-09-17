package com.javatechie.springboot.mongodb.docker;

import com.javatechie.springboot.mongodb.docker.dao.BookRepository;
import com.javatechie.springboot.mongodb.docker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class SpringbootMongodbDockerApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbDockerApplication.class, args);
	}

}
