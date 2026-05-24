package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// @RestController means this class handles HTTP requests (from Postman or browser)
// @RequestMapping means all URLs here start with /api/books
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // POST /api/books - Add a new book
   
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // GET /api/books - Get all books
  
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // GET /api/books/1 - Get one book by ID
 
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // PUT /api/books/1 - Update a book
  
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    // DELETE /api/books/1 - Delete a book
   
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}
