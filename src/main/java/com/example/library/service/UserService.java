package com.example.library.service;

import com.example.library.model.User;
import com.example.library.model.UserLevel;
import com.example.library.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @EventListener(ApplicationReadyEvent.class)
    public void runExample(){
      User user = new User(1L, "Marta", "pisz", "123", UserLevel.USER);
      userRepo.save(user);
    }
}
