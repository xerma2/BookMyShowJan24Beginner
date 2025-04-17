package com.backendlld.bookmyshowjan24beginner.services;

import com.backendlld.bookmyshowjan24beginner.models.User;
import com.backendlld.bookmyshowjan24beginner.repos.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User signUpUser(
            String username,
            String email,
            String password
    ){
        // Check if user is already registered using email
        Optional<User> userOptional =  userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists");
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(username);
        return userRepository.save(user);
    }
}
