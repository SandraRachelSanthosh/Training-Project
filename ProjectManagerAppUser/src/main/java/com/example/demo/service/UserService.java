package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;
    //getting all user record by using the method findAll() of CrudRepository
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users1 -> users.add(users1));
        return users;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public User getUsersById(int id)
    {
        return userRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(User users)
    {
        userRepository.save(users);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        userRepository.deleteById(id);
    }
    //updating a record
    public void update(User users, int userid)
    {
        userRepository.save(users);
    }
}