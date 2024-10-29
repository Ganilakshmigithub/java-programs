package com.ex.gani.Entities;
import jakarta.persistence.*;
@Embeddable
public class Location {
    String ins_name;
    String city;
    
    public Location() {
    }
    public Location(String ins_name, String city) {
        this.ins_name = ins_name;
        this.city = city;
    }
    public String getIns_name() {
        return ins_name;
    }
    public void setIns_name(String ins_name) {
        this.ins_name = ins_name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


    
}
