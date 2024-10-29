package Spring.Core.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Spring.Core.Services.CustomerService;
import jakarta.annotation.PostConstruct;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService cService;
    public  CustomerController() {
        System.out.println("CustomerController Constructor");
}
@PostConstruct
public void getCustomer(){
    System.out.println(cService.getCustomer());
    System.out.println("CustomerController getCustomer");
}
}
