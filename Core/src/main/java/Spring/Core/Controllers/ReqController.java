package Spring.Core.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class ReqController {

    @GetMapping
    public String greet(@RequestParam String address, @RequestParam int no) {
        if (no < 0) {
            return "Age cannot be negative.";
        }
        return String.format("Hello, %s! You are %d years old.", address, no);
    }
}
