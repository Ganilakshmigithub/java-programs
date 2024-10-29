package Spring.Core.Shopping;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Indicate this class is an Aspect
@Component // Make this class a Spring-managed component
public class ErrorAspect {

    // Define a pointcut for all methods in the ShoppingCart class
    @Pointcut("execution(* Spring.Core.Shopping.ShoppingCart.*(..))")
    public void allMethods() {}

    // Around advice
    @Around("allMethods()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before method: " + joinPoint.getSignature().getName());

        Object result;

        try {
            // Proceed with the actual method call
            result = joinPoint.proceed();
            System.out.println("After method: " + joinPoint.getSignature().getName());
        } catch (Throwable throwable) {
            // Handle exception
            System.err.println("Exception in method: " + joinPoint.getSignature().getName());
            System.err.println("Error message: " + throwable.getMessage());
            throw throwable; // Re-throw the exception
        }

        return result; // Return the result of the method
    }
}
