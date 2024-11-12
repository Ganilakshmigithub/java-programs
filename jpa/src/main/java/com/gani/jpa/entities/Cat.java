package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue("A cat ")
public class Cat extends Animal{
    boolean isindoor;

    public boolean isIsindoor() {
        return isindoor;
    }

    public void setIsindoor(boolean isindoor) {
        this.isindoor = isindoor;
    }
    
}
