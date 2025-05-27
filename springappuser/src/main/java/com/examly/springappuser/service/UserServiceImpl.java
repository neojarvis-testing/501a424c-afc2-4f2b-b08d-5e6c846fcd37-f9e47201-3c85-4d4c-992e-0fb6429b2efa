package main.java.com.examly.springappuser.service;

import main.java.com.examly.springappuser.model.User;
import main.java.com.examly.springappuser.repository.UserRepo;
import main.java.com.examly.springappuser.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepository;

    @Override
    public User register(User user){
        if(userRepository.findByEmail(user.getEmail())){
            throw new RuntimeException("Email already registered");
        }
        return userRepository.save(user);
    }
    
}
