package com.ex.gani.Entities;
import jakarta.persistence.*;
@Entity
public class Dog2 extends Animal{
    String favgame;

    public String getFavgame() {
        return favgame;
    }

    public void setFavgame(String favgame) {
        this.favgame = favgame;
    }

}
