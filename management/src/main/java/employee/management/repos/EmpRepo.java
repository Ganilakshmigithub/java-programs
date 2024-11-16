package employee.management.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import employee.management.entities.Employees;

public interface EmpRepo extends JpaRepository<Employees,Integer>{
    
}
