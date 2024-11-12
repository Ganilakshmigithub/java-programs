package spring.jpa.datajpa.controllers;

import spring.jpa.datajpa.services.*;
import spring.jpa.datajpa.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Only ADMIN can create a category
    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    // Only ADMIN can delete a category by its code
    @DeleteMapping("/codes/{code}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteCategory(@PathVariable String code) {
        categoryService.deleteDesc(code);
    }

    // Both ADMIN and USER can check if a category exists
    @GetMapping("/{code}/exists")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public boolean exists(@PathVariable String code) {
        return categoryService.existdesc(code);
    }

    // Both ADMIN and USER can get all categories
    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public Iterable<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Both ADMIN and USER can get categories with pagination
    @GetMapping("/page")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public Page<Category> getCategories(@RequestParam int page, @RequestParam int size) {
        return categoryService.getCategories(page, size);
    }

    // Only ADMIN can delete all categories
    @DeleteMapping("/cat/del")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteAll() {
        categoryService.deleteAll();
    }
}
