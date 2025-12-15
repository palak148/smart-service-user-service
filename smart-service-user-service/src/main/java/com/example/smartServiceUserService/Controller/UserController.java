package com.example.smartServiceUserService.Controller;


import com.example.smartServiceUserService.Service.UserService;
import com.example.smartServiceUserService.domain.User;
import com.example.smartServiceUserService.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/id")
    public Optional<User> getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/id")
    public User updateUser(Long id){
        return new User();
    }

    public void deleteUser(Long id){

    }
}