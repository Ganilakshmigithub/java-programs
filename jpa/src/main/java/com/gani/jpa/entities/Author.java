package com.gani.jpa.entities;
import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    
    private String name;

    // Constructors, getters, and setters
    public Author() {}
    
    public Author(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
