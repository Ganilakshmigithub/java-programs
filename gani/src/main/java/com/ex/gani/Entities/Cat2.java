package com.ex.gani.Entities;
import jakarta.persistence.*;
@Entity
public class Cat2 extends Animal{
   String favfood;

public String getFavfood() {
    return favfood;
}

public void setFavfood(String favfood) {
    this.favfood = favfood;
}

    
}
