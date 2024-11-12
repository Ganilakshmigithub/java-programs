package Spring.boot.crud.services;

import Spring.boot.crud.entities.*;
import Spring.boot.crud.repos.*;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class Empservice {

    @Autowired
    EmpRepo er;
    public employees saveorUpdateEmp(employees emp,Set<PhoneNumber> PhoneNumbers){
        emp.setPhoneNumbers(PhoneNumbers);
        return er.save(emp);
    }

    public Page<employees> getAllEmp(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size,Sort.by("name"));
        return er.findAll(pageable); 
    }

    public employees FindEmpById(int id){
        return er.findById(id).orElse(null);

    }

    public void deleteEmp(int id){
        er.deleteById(id);
    }
}
