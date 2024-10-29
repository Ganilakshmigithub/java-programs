package com.gani.jpa.entities;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @ManyToMany(mappedBy ="favfood")
    Set<People> ppl=new HashSet<>();
    public Food() {
    }
    public Food(String name) {
        this.name = name;
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
    public Set<People> getPpl() {
        return ppl;
    }
    public void setPpl(Set<People> ppl) {
        this.ppl = ppl;
    }
    



    
}
