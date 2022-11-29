package com.upc.inmemory.api;

import com.upc.inmemory.domain.model.Book;
import com.upc.inmemory.domain.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAll(){
        List<Book> books;
        books = bookService.getAll();
        if(books.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody Book book){
        Book bookCreated = bookService.create(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookCreated);
    }
}
