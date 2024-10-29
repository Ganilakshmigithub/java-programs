package com.gani.jpa.entities;
import jakarta.persistence.*;
@Entity
public class Book {
    String bookname;
    @EmbeddedId
    Authortitle key;
    public Book() {
    }
    public Book(String bookname, Authortitle key) {
        this.bookname = bookname;
        this.key = key;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public Authortitle getKey() {
        return key;
    }
    public void setKey(Authortitle key) {
        this.key = key;
    }

}
