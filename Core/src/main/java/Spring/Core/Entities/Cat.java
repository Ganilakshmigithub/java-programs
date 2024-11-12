package Spring.Core.Entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary //highest priority bean
@Service
public class Cat implements Animal{
    public String character(){
        return "meow";
    }
}