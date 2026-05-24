# Library Book Tracker

A REST API built using Spring Boot, Hibernate, JDBC, and PostgreSQL to manage library book records.

## Features
- Add a new book
- View all books
- View a book by ID
- Update book details
- Delete a book

## Technologies Used
- Java 17
- Spring Boot 3.2
- Hibernate (JPA)
- JDBC
- PostgreSQL
- Postman (for testing)

## How to Run

### Step 1 - Create database in PostgreSQL
Open pgAdmin or psql and run:
```sql
CREATE DATABASE librarydb;
```

### Step 2 - Update password
In `src/main/resources/application.properties`, replace `yourpassword` with your PostgreSQL password.

### Step 3 - Run the project
Open the project in IntelliJ IDEA, right-click `LibraryTrackerApplication.java` and click Run.

### Step 4 - Test using Postman

| Operation | Method | URL | Body (JSON) |
|-----------|--------|-----|-------------|
| Add book | POST | http://localhost:8080/api/books | `{"title":"Harry Potter","author":"J.K. Rowling","genre":"Fiction"}` |
| Get all books | GET | http://localhost:8080/api/books | None |
| Get by ID | GET | http://localhost:8080/api/books/1 | None |
| Update book | PUT | http://localhost:8080/api/books/1 | `{"title":"Updated Title","author":"Author","genre":"Genre"}` |
| Delete book | DELETE | http://localhost:8080/api/books/1 | None |
