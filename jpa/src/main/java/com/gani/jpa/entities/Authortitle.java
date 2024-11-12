package com.gani.jpa.entities;
import jakarta.persistence.*;
import java.io.Serializable;
@Embeddable
public class Authortitle implements Serializable{
   int author_id;
   int title_id;
public Authortitle() {
}


public Authortitle(int author_id, int title_id) {
    this.author_id = author_id;
    this.title_id = title_id;
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + author_id;
    result = prime * result + title_id;
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Authortitle other = (Authortitle) obj;
    if (author_id != other.author_id)
        return false;
    if (title_id != other.title_id)
        return false;
    return true;
}
public int getAuthor_id() {
    return author_id;
}
public void setAuthor_id(int author_id) {
    this.author_id = author_id;
}
public int getTitle_id() {
    return title_id;
}
public void setTitle_id(int title_id) {
    this.title_id = title_id;
}

    
}
