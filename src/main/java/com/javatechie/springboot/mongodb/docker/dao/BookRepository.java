package com.javatechie.springboot.mongodb.docker.dao;

import com.javatechie.springboot.mongodb.docker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book,Integer>{
}
