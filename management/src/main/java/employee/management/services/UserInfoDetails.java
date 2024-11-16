package employee.management.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import employee.management.entities.UsersInfo;

public class UserInfoDetails implements UserDetails{

    String username;
    String password;
    List<GrantedAuthority> authorities=new ArrayList<>();

    public UserInfoDetails(UsersInfo userinfo){
        this.username=userinfo.getEmail();
        this.password=userinfo.getPassword();
        this.authorities=List.of(userinfo.getRoles().split(",")).stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
      
    }

    
    
}
