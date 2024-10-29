package Spring.Core.Services;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void addUser(String name){
        System.out.println("User added: " + name);
    }
    public void  removeUser(String name){
        System.out.println("user removed"+name);
}
}
