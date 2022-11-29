package com.upc.inmemory.service;

import com.upc.inmemory.domain.model.Book;
import com.upc.inmemory.domain.persistence.BookRepository;
import com.upc.inmemory.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(Book request) {
        return bookRepository.save(request);
    }
}
