package com.gani.jpa.entities;

import jakarta.persistence.*;
@Entity
public class Category {
    @Id
private int id;
private String name;


public Category(int id, String name) {
    this.id = id;
    this.name = name;
}
public Category(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
