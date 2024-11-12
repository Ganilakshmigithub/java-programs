package spring.jpa.datajpa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.jpa.datajpa.entities.Employee;
import spring.jpa.datajpa.services.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    EmpService es;
    
    @PostMapping("/emp")
    public Employee createEmp(@RequestBody Employee emp){
        return  es.createEmp(emp);

    }

    @GetMapping("/get/{age}")
    public List<Employee> findallEmployeeByage(@PathVariable int age){
        return es.FindallEmploageyeeByAge(age);
    }

    @DeleteMapping("/del/{age}")
    public void deleteEmpAge(@PathVariable int age){
         es.deleteEmp(age);
    }
}
