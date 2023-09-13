package com.springboot.relationshipwithspringboot.service;

import com.springboot.relationshipwithspringboot.entity.BookEntity;
import com.springboot.relationshipwithspringboot.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository repository;


    public void save(BookEntity book){
        BookEntity bookEntity = new BookEntity();

        bookEntity.setTitle(bookEntity.getTitle());

    }
}
