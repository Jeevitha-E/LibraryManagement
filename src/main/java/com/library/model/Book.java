package com.library.model;

import jakarta.persistence.*;

// @Entity tells Hibernate - create a table for this class
// The table name will be 'book' in PostgreSQL
@Entity
@Table(name = "book")
public class Book {

    // @Id means this is the primary key
    // @GeneratedValue means PostgreSQL will auto-generate the ID 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;   
    private String author;  
    private String genre;   // e.g. Fiction, Science, History

    // Default constructor - required by Hibernate
    public Book() {}

    // Constructor with all fields
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

   
    // Getters - to READ the values
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    // Setters - to SET/UPDATE the values
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
}
