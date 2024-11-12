package com.gani.jpa.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Add id field
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL) // Corrected spelling
    private List<Employee> employees = new ArrayList<>(); // Initialize list

    public Company() {}

    public Company(String name, List<Employee> employees) {
        this.name = name;
        if (employees != null) {
            this.employees = employees;
        }
    }

    public Long getId() { // Getter for id
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() { // Corrected method name
        return employees;
    }

    public void setEmployees(List<Employee> employees) { // Corrected method name
        this.employees = employees;
    }
}
