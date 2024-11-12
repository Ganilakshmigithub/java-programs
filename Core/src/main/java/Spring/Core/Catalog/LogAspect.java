package Spring.Core.Catalog;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* Spring.Core.Catalog.Books.*(..))")
    public void allBooksMethods() {}

    @Before("allBooksMethods()")
    public void before(JoinPoint jp) {
        System.out.println("Before Advice for " + jp.getSignature());
    }
}
