package Spring.Core.Services;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    @Pointcut("args(String, double) && target(Spring.Core.Services.Product)")
    public void addMethod() {}

    @Pointcut("args(String, int) && target(Spring.Core.Services.Product)")
    public void updateMethod() {}

    @Before("addMethod()")
    public void log1() {
        System.out.println("Added log");
    }

    @Before("updateMethod()")
    public void log2() {
        System.out.println("Updated log");
    }
}
