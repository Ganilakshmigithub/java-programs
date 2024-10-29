package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Books{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false) // Foreign key to Author
    private Author author;

    // Constructors, getters, and setters
    public Books() {}

    public Books(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}
