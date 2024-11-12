package spring.jpa.datajpa.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.jpa.datajpa.entities.Employee;
import java.util.List;



@Repository
public interface EmpRepo  extends JpaRepository<Employee,Integer>{
    List<Employee>findByAge(int age);


    @Modifying
    @Query("delete from Employee e where e.age=:age")
    void deleteByAge(@Param("age") int age);
}
