package spring.jpa.datajpa.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.jpa.datajpa.entities.Category;


@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {
    // Additional methods can be defined here if needed
}
