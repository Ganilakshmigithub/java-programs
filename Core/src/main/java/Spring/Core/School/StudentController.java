package Spring.Core.School;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudService st;  // Inject the service

    // Endpoint to mark attendance
    @PostMapping("/marking")
    public void markAttendance(@RequestParam String name) {
        st.getStudentAttendance(new Student(name));
    }

    // Endpoint to retrieve all students
    @GetMapping("/retrieve")
    public List<Student> getStudents() {
        return st.getStudents();
    }
}
