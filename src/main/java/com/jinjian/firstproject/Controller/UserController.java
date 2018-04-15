package com.jinjian.firstproject.Controller;

import com.jinjian.firstproject.domain.User;
import com.jinjian.firstproject.properties.UserProperties;
import com.jinjian.firstproject.repsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    //private UserProperties userProperties;
    private UserRepository userRepository;

    @GetMapping("/hello")
    public List<User> hello() {
       return userRepository.findAll();
    }
}
