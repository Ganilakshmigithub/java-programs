package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class names {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private int id;
    private String name;

    // No-argument constructor
    public names() {
    }

    // Parameterized constructor
    public names(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
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

