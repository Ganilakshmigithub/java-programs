package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
public class customer {
    @Id
    String name;
    long phone_no;
    String email;
    public customer(String name, long phone_no, String email) {
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone_no() {
        return phone_no;
    }
    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
