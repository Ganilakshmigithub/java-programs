package Spring.Core.School;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAttendance {

    // Pointcut for the getStudentAttendance method
    @Pointcut("execution(* Spring.Core.School.StudService.getStudentAttendance(..)) && args(student)")
    public void logAtt(Student student) {}

    // After returning advice
    @AfterReturning(pointcut = "logAtt(student)", returning = "student")
    public void afterMarkAttendance(Student student) {
        System.out.println("Student after successfully marking attendance: " + student.getName());
    }
}
