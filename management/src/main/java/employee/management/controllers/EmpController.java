package employee.management.controllers;
import employee.management.entities.Employees;
import employee.management.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    private EmpService empService;



    @PostMapping("/employee/create")
    public ResponseEntity<?> createEmployee(@RequestBody Employees employee) {
        Employees createdEmployee = empService.createEmp(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(HttpStatus.CREATED.value(),"employee created", createdEmployee));
    }

    @GetMapping
    public ResponseEntity<?> getAllEmployees(
            @RequestParam int page,
            @RequestParam int size) {
        Page<Employees> employeesPage = empService.getAllEmp(page, size);

        ApiResponse apiResponse=new ApiResponse(
            HttpStatus.OK.value(),
            "employees fetched successfully",
            employeesPage.getContent(),
            employeesPage.getNumber(),
            employeesPage.getTotalPages(),
            employeesPage.getTotalElements());

            return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
        

    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable int id) {
        Employees employee = empService.findEmpById(id);
        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(HttpStatus.OK.value(),"employee fetched by Id", employee));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable int id, @RequestBody Employees emp) {

        emp.setId(id);
        Employees updatedEmployee = empService.updateEmp(emp);
        if (updatedEmployee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(HttpStatus.CREATED.value(),"employee updated by Id", updatedEmployee));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable int id) {
        Employees employee = empService.findEmpById(id);
        if (employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        empService.deleteEmp(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(HttpStatus.ACCEPTED.value(),"employee deleted by Id", employee));
    }
}
