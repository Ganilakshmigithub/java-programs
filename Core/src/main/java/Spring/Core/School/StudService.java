package Spring.Core.School;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudService {
    private List<Student> students = new ArrayList<>();

    // Method to mark attendance and add student to the list
    public void getStudentAttendance(Student student) {
        students.add(student);  // Add the student to the list
        System.out.println("Student marked attendance: " + student.getName());
    }

    // Method to retrieve the list of students
    public List<Student> getStudents() {
        return students;  // Return the list of students
    }
}
