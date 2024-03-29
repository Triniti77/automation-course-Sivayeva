package com.company.homework.hw08;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String author;
    private String year;
    private String description;
    private String isbn;

    public Book(){
        this.id = UUID.randomUUID().toString();
    }

    public Book(String title, String author, String year, String description, String isbn){
        this();
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
