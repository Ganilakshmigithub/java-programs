package Spring.Core.Services;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("this(Spring.Core.Services.UserService)||this(Spring.Core.Services.ProductService)")
    public void allMethods(){}
    @Before("allMethods()")
    public void  log(){
        System.out.println("A method in  UserService or ProductService was called");
}
}
