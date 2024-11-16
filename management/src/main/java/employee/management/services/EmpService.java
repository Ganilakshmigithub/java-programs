package employee.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import employee.management.entities.Employees;
import employee.management.repos.EmpRepo;

@Service
public class EmpService {

        @Autowired
    EmpRepo er;
    public Employees createEmp(Employees emp){
        return er.save(emp);
    }

    public Page<Employees> getAllEmp(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return er.findAll(pageable); 
    }

    public Employees findEmpById(int id){
        return er.findById(id).orElse(null);

    }

    public Employees updateEmp(Employees employeeFromRequest){
        Employees employeeFromDb=new Employees();
        if(!employeeFromRequest.getName().isEmpty()){
            employeeFromDb.setName(employeeFromRequest.getName());
        }
        if(!employeeFromRequest.getPhoneNumbers().isEmpty()){
            employeeFromDb.setPhoneNumbers(employeeFromRequest.getPhoneNumbers());
        }
     er.save(employeeFromDb);

     return employeeFromDb;
     
    }

    public void deleteEmp(int id){
        er.deleteById(id);
    }


        
}
