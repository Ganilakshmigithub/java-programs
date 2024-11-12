package com.ex.gani.Entities;
import jakarta.persistence.*;
@Entity
public class Dog1 extends Animal{
    String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Dog1() {}
    
}
