package com.ex.gani.Entities;
import jakarta.persistence.*;
@Entity
public class Cat1 extends Animal{
    boolean isindoor;

    public boolean isIsindoor() {
        return isindoor;
    }

    public void setIsindoor(boolean isindoor) {
        this.isindoor = isindoor;
    }

}
