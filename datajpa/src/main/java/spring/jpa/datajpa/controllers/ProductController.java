package spring.jpa.datajpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spring.jpa.datajpa.entities.Product;
import spring.jpa.datajpa.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/name/{name}")
    public List<Product> getProductsByName(@PathVariable String name) {
        return productService.getProductsByName(name);
    }

    @GetMapping("/price/above/{price}")
    public List<Product> getProductsAbovePrice(@PathVariable Double price) {
        return productService.getProductsAbovePrice(price);
    }

    @GetMapping("/name/{name}/price/{price}")
    public List<Product> getProductsByNameAndPrice(@PathVariable String name, @PathVariable Double price) {
        return productService.getProductsByNameAndPrice(name, price);
    }
}
