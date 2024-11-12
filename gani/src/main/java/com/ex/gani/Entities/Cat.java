package com.ex.gani.Entities;
import jakarta.persistence.*;
@Entity
public class Cat extends Animal{
    String favcolor;

    public String getFavcolor() {
        return favcolor;
    }

    public void setFavcolor(String favcolor) {
        this.favcolor = favcolor;
    }
    
}
