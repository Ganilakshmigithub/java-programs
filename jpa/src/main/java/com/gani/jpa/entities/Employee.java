package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Add id field
    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id") // Corrected column name
    private Company company; // Corrected spelling

    public Employee() {}

    public Employee(String name, Company company) { // Corrected spelling
        this.name = name;
        this.company = company;
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

    public Company getCompany() { // Corrected spelling
        return company;
    }

    public void setCompany(Company company) { // Corrected spelling
        this.company = company;
    }
}
