package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Course course;  // Changed to 'Course'

    public Teacher() {
    }

    public Teacher(String name, Course course) {  // Changed to 'Course'
        this.name = name;
        this.course = course;
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

    public Course getCourse() {  // Changed to 'Course'
        return course;
    }

    public void setCourse(Course course) {  // Changed to 'Course'
        this.course = course;
    }
}
