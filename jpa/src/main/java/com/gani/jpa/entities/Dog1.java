package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Dog1 extends Animal1 {
    private String breed; // Changed to private for encapsulation

    // Getters and Setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
