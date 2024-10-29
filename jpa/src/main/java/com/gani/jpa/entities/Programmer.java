package com.gani.jpa.entities;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @ElementCollection
    @CollectionTable(name="programmer_skills")
    Set<String>skills=new HashSet<>();
    public Programmer() {
    }
    public Programmer(String name, Set<String> skills) {
        this.name = name;
        this.skills = skills;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<String> getSkills() {
        return skills;
    }
    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }


    
}
