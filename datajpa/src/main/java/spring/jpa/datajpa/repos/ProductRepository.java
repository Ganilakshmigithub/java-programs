package spring.jpa.datajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.jpa.datajpa.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.name = ?1")
    List<Product> findByName(String name);

    @Query("SELECT p FROM Product p WHERE p.price > ?1")
    List<Product> findByPriceGreaterThan(Double price);

    @Query("SELECT p FROM Product p WHERE p.name = :name AND p.price = :price")
    List<Product> findByNameAndPrice(String name, Double price);
}
