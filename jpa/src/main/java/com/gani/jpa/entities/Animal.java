package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Animal_type")
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
