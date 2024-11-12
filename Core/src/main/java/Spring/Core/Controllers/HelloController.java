package Spring.Core.Controllers;

import java.util.List;
import Spring.Core.Entities.*;
import Spring.Core.Services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @Autowired
	StudentService studentService;
	@RequestMapping("/students")
	public List<Student> numberOfStudents() {
		return studentService.studentDetails();
	}
	// @RequestMapping(method = RequestMethod.POST, value = "/students")
	// public void addStudent(@RequestBody Student student) {
	// 	studentService.addNewStudent(student);
	// }

	@RequestMapping(method = RequestMethod.PUT, value = "/students/{name}")
	public void updateStudent(@RequestBody Student student, @PathVariable String name) {
		studentService.updateExistingStudent(name, student);
	}


}