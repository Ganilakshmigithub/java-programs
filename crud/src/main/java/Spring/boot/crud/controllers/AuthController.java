package Spring.boot.crud.controllers;

import Spring.boot.crud.entities.User;
import Spring.boot.crud.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @RequestBody User user
    ){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse(HttpStatus.CREATED.value(), "user registerd successfully", user));
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user){
        String token = authService.loginUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse(HttpStatus.OK.value(),"User logged in successfully", token));
    }

}