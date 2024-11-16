package Spring.boot.crud.services;

import Spring.boot.crud.entities.User;
import Spring.boot.crud.repos.UserRepo;
import Spring.boot.crud.security.JWTProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService userDetailsService;

    public User registerUser(User user){
        if(user.getName()==null){
            throw new BadCredentialsException("User Name Not Found");
        }
        if(user.getEmail()==null){
            throw new BadCredentialsException("Email Not Found");
        }
        if(user.getPassword()==null){
            throw new BadCredentialsException("Password Not Found");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    public String loginUser(User user){
        String email = user.getEmail();
        String password = user.getPassword();
        UserDetails userDetails = userDetailsService.loadUserByUsername(email);
        if(userDetails == null){
            throw new BadCredentialsException("Invalid UserName");
        }
        if(!passwordEncoder.matches(password, userDetails.getPassword())){
            throw new BadCredentialsException("Password mismatch");
        }
        Authentication auth = new UsernamePasswordAuthenticationToken(email,password);
        return JWTProvider.generateJwtToken(auth);
    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }


}