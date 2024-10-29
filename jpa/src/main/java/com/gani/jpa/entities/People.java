package com.gani.jpa.entities;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   int id;
   String  name;
   @ManyToMany(cascade =CascadeType.ALL)
   @JoinTable(name="ppls_food",joinColumns =@JoinColumn(name="ppls_id"),inverseJoinColumns= @JoinColumn(name = "food_id"))
   Set<Food> favfood=new HashSet<>();
   public People() {
}
   public People(String name, Set<Food> favfood) {
    this.name = name;
    this.favfood = favfood;
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
public Set<Food> getFavfood() {
    return favfood;
}
public void setFavfood(Set<Food> favfood) {
    this.favfood = favfood;
}

  
}
