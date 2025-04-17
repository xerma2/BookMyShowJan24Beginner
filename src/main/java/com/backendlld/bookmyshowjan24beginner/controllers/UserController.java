package com.backendlld.bookmyshowjan24beginner.controllers;

import com.backendlld.bookmyshowjan24beginner.dtos.ResponseStatus;
import com.backendlld.bookmyshowjan24beginner.dtos.SignUpUserRequestDTO;
import com.backendlld.bookmyshowjan24beginner.dtos.SignUpUserResponseDTO;
import com.backendlld.bookmyshowjan24beginner.models.User;
import com.backendlld.bookmyshowjan24beginner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpUserResponseDTO signUpUser(SignUpUserRequestDTO request){
        SignUpUserResponseDTO response = new SignUpUserResponseDTO();
        try{
            User user = userService.signUpUser(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
            );
            response.setUserId(user.getId());
            response.setMessage("User successfully registered!");
            response.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setMessage("Failed to create the user : " + ex.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}


// BookTicket
// controllers

//  Service : what code ?
    // validate showId / userId
    // get the details about the selected seats
    // check if all the seats are available
            // yes
                // block all the seats , blocked at
                // creating a booking object and return it
            // no : Something went wrong / try again

// input ?
        // userId , showID, seats ?
// output
    // temporary booking id


// Homework : Complete Book ticket functionality
// raise a Pull request




