package spring.jpa.datajpa.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import spring.jpa.datajpa.entities.Category;
import spring.jpa.datajpa.repos.CategoryRepo;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepo categoryRepo;

    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }
    public void deleteDesc(String code){
        categoryRepo.deleteById(code);
    }

    public boolean existdesc(String code){
       return  categoryRepo.existsById(code);
    }

    public Iterable<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Page<Category> getCategories(int page,int size){
        Pageable pageable = PageRequest.of(page, size,Sort.by("description"));
        return categoryRepo.findAll(pageable.withPage(3));
        

    }

}

