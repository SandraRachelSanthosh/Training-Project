package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    //creating a get mapping that retrieves all the users detail from the database
    @GetMapping("/user")
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    /*private List<User> allUsers = Arrays.asList(
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
*/
    @GetMapping ("/book/{bookid}")
    private User getUsers(@PathVariable("userid") int userid)
    {
        return userService.getUsersById(userid);
    }

    @DeleteMapping("/user/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }


    @PostMapping("/users")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getUserId();
    }

    @PutMapping("/users")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }
}
