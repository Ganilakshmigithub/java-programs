package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Animal1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // Changed to private for encapsulation

    private String name; // Changed to private for encapsulation

    // Getters and Setters
    public int getId() { // Added getter for id
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
