package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
// @NamedQuery(name="Employees.findByname",query="select emp from Employees emp where name=:name")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empi_id;
    String name;
    int salary;
    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getEmpi_id() {
        return empi_id;
    }
    public void setEmpi_id(int empi_id) {
        this.empi_id = empi_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
