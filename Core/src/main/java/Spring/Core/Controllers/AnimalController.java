package Spring.Core.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Spring.Core.Entities.*;
@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    // @Qualifier("cat") //to get details of specific bean
 Animal animal;
 @GetMapping
    public String dogdetails(){
        return animal.character();
    }
}
