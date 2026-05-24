package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Service layer - contains the logic of what to do
// Controller calls Service, Service calls Repository
@Service
public class BookService {

    @Autowired  // Spring automatically connects BookRepository here
    private BookRepository bookRepository;

    // ADD a new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // GET all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET one book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // UPDATE a book
    public Book updateBook(Long id, Book updatedBook) {
        Book existing = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
        existing.setTitle(updatedBook.getTitle());
        existing.setAuthor(updatedBook.getAuthor());
        existing.setGenre(updatedBook.getGenre());
        return bookRepository.save(existing);
    }

    // DELETE a book
    public String deleteBook(Long id) {
        bookRepository.deleteById(id);
        return "Book with id " + id + " deleted successfully";
    }
}
