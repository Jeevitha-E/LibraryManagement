package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is the starting point of the entire project, it will start the server
@SpringBootApplication
public class LibraryTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryTrackerApplication.class, args);
    }
}
