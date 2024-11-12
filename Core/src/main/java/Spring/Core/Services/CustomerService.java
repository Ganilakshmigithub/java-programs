package Spring.Core.Services;
import org.springframework.stereotype.Service;

import Spring.Core.Entities.*;
// import jakarta.annotation.PostConstruct;
@Service
public class CustomerService {
    public CustomerService(){
        System.out.println("Customer service constructor");
    }
    public Customer getCustomer(){
        return new Customer("Gani Lakshmi","kakinada");
    }
}
