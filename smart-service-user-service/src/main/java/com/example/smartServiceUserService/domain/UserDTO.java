package com.example.smartServiceUserService.domain;

import com.example.smartServiceUserService.domain.Enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    String name;
    String phoneNumber;
    String emailId;
    Address address;
    UserRole role;
}