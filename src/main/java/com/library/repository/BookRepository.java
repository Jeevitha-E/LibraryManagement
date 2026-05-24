package com.library.repository;

import com.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface connects to the database
// JpaRepository gives us ready-made methods:
// save() - to add or update a book
// findAll() - to get all books
// findById() - to get one book by ID
// deleteById() - to delete a book
// We don't need to write any SQL - Hibernate handles it automatically
public interface BookRepository extends JpaRepository<Book, Long> {
}
