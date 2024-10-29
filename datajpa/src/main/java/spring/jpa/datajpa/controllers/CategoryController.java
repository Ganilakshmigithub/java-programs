package spring.jpa.datajpa.controllers;

import spring.jpa.datajpa.services.*;
import spring.jpa.datajpa.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/codes/{code}")
    public void deleteCategory(@PathVariable String code) {
        categoryService.deleteDesc(code);
    }

    @GetMapping("/{code}/exists")
    public boolean exists(@PathVariable String code) {
        return categoryService.existdesc(code);
    }

    @GetMapping
    public Iterable<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/page")
    public Page<Category> getCategories(@RequestParam int page, @RequestParam int size) {
        return categoryService.getCategories(page, size);
    }
}

