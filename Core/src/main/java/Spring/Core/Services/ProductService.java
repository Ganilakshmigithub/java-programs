package Spring.Core.Services;

import org.springframework.stereotype.Service;

@Service

public class ProductService {
    public void addProduct(String name){
        System.out.println("Product added: " + name);
    }
    public void removeProduct(String name){
        System.out.println("Product removed: " + name);
    }
}
