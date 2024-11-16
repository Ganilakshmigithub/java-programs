package employee.management.services;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import employee.management.entities.UsersInfo;
import employee.management.repos.UsersInfoRepo;

@Service
@ComponentScan("org.springframework.security.crypto.password")
public class UsersInfoService implements UserDetailsService{

    @Autowired
    UsersInfoRepo usersInfoRepo;

    @Autowired
    private PasswordEncoder passwordencoder;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UsersInfo> userDetail=usersInfoRepo.findByEmail(username);
        return userDetail.map(UserInfoDetails::new).orElseThrow(()->new UsernameNotFoundException("User not found"+username));
    }

    public String addUser(UsersInfo userInfo){
        userInfo.setPassword(passwordencoder.encode(userInfo.getPassword()));
        usersInfoRepo.save(userInfo);
        return "User added successfully";
    }

    

}
    

