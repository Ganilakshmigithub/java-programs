package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
public class Dog3 extends Animal3 {
    String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
}
