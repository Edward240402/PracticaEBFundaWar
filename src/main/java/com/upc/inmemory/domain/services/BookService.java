package com.upc.inmemory.domain.services;

import com.upc.inmemory.domain.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book create(Book request);
}
