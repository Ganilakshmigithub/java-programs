package com.ex.gani.Entities;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class pgmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @ElementCollection
    @CollectionTable(name="skills_table")
    List<String>Skills=new ArrayList<>();
    public pgmer() {
    }
    public pgmer(String name, List<String> skills) {
        this.name = name;
        Skills = skills;
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
    public List<String> getSkills() {
        return Skills;
    }
    public void setSkills(List<String> skills) {
        Skills = skills;
    }





}