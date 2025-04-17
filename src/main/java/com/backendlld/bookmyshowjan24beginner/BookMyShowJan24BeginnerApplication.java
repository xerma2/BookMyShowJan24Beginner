package com.backendlld.bookmyshowjan24beginner;

import com.backendlld.bookmyshowjan24beginner.controllers.UserController;
import com.backendlld.bookmyshowjan24beginner.dtos.SignUpUserRequestDTO;
import com.backendlld.bookmyshowjan24beginner.dtos.SignUpUserResponseDTO;
import com.backendlld.bookmyshowjan24beginner.models.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookMyShowJan24BeginnerApplication implements CommandLineRunner {
    @Autowired
    private UserController userController;
    @Override
    public void run(String... args) throws Exception {
        SignUpUserRequestDTO request = new SignUpUserRequestDTO();
        request.setEmail("mohit.sharma1@scaler.com");
        request.setPassword("password");
        request.setUsername("Mohit Sharma");

        SignUpUserResponseDTO response = userController.signUpUser(request);
        System.out.println(response.getMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowJan24BeginnerApplication.class, args);
    }

}
