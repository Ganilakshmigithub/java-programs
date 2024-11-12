package Spring.Core.Services;

import Spring.Core.Entities.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
	List<Student> studentList = new ArrayList<>(Arrays.asList(
		new Student("John", 1, 8, 5),
		new Student("Paul", 2, 7, 5),
		new Student("Andrew", 3, 8, 5),
		new Student("Kevin", 4, 9, 5)
	));
	public List<Student> studentDetails() {
		return studentList;
	}
	public void updateExistingStudent(String name, Student student) {
		for (Student studentTemp : studentList) {
			if (studentTemp.getName().equals(name)) {
				int i = studentList.indexOf(studentTemp);
				studentList.set(i, student);
			}
		}
	}	
	
}