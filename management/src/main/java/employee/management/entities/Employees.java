package employee.management.entities;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private  List<Long> phoneNumbers=new ArrayList<>();
    
    public Employees( String name, List<Long> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
    public Employees() {
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
    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    

    
    
}
