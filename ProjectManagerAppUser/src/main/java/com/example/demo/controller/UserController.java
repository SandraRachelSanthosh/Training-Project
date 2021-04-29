package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> allUsers = Arrays.asList(
            new User("1","Sandra"),
            new User("2","Anna")
    );

    @GetMapping
    public List<User>getAllUsers(){
        return allUsers;
    }
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable String userId) throws IllegalAccessException {
        return allUsers.stream()
                       .filter(user -> user.getUserId().equals(userId))
                       .findFirst()
                       .orElseThrow(IllegalAccessException::new);
    }

}
