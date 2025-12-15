package com.example.smartServiceUserService.Service;


import com.example.smartServiceUserService.Repository.UserRepository;
import com.example.smartServiceUserService.domain.Enums.UserRole;
import com.example.smartServiceUserService.domain.User;
import com.example.smartServiceUserService.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public UserDTO createUser (User user){

        User savedUser = userRepository.save(user);
        return UserDTO.builder()
                .name(savedUser.getName())
                .phoneNumber(savedUser.getPhoneNumber())
                .emailId(savedUser.getEmailId())
                .address(savedUser.getAddress())
                .role(savedUser.getRole())
                .build();
    }
}