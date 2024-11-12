package Spring.Core.Entities;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
public class Dog implements Animal{
    public String character(){
        return "bow";
    }
}
