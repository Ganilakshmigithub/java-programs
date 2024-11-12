package spring.jpa.datajpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.jpa.datajpa.entities.Product;
import spring.jpa.datajpa.repos.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> getProductsAbovePrice(Double price) {
        return productRepository.findByPriceGreaterThan(price);
    }

    public List<Product> getProductsByNameAndPrice(String name, Double price) {
        return productRepository.findByNameAndPrice(name, price);
    }
}
