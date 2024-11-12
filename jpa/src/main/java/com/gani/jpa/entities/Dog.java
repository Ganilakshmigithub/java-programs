package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue(" A dog ")
public class Dog extends Animal {
    private String breed; // Encapsulated field

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
