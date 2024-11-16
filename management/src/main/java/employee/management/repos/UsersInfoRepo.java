package employee.management.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import employee.management.entities.UsersInfo;
import java.util.Optional;



public interface UsersInfoRepo extends JpaRepository<UsersInfo,Integer>{
 
    Optional<UsersInfo> findByEmail(String email);
}
