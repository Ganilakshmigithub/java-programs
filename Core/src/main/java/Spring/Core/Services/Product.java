package Spring.Core.Services;

import org.springframework.stereotype.Service;

@Service
public class Product {
    public void addItem(String name,double price){
        System.out.println("Adding item: "+name+" Price: "+price);
    }
    public void updateItem(String name,int quantity){
        System.out.println("product updated with name "+name+"and quantity "+quantity);
    }
}
