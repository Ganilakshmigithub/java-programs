package spring.jpa.datajpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import spring.jpa.datajpa.entities.Employee;
import spring.jpa.datajpa.repos.EmpRepo;

@Service
public class EmpService {
    
    @Autowired
    EmpRepo er;

    public Employee createEmp(Employee emp){
        return er.save(emp);    
    }

    public List<Employee> FindallEmploageyeeByAge(int age) {
        return er.findByAge(age);
}

@Transactional
public void deleteEmp(int age){
    er.deleteByAge(age);

}
}