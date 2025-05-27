package main.java.com.examly.springappuser.controller;

import main.java.com.examly.springappuser.model.User;
import main.java.com.examly.springappuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User savedUser = userService.register(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    
}
