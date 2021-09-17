package com.javatechie.springboot.mongodb.docker.controller;

import com.javatechie.springboot.mongodb.docker.dao.BookRepository;
import com.javatechie.springboot.mongodb.docker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getBook(){
        return bookRepository.findAll();
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

}
