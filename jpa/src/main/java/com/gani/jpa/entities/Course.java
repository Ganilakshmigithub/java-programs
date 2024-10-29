package com.gani.jpa.entities;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;  // Changed to 'Teacher'

    public Course() {
    }

    public Course(String title, Teacher teacher) {  // Changed to 'Teacher'
        this.title = title;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {  // Changed to 'Teacher'
        return teacher;
    }

    public void setTeacher(Teacher teacher) {  // Changed to 'Teacher'
        this.teacher = teacher;
    }
}
