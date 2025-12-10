package com.example.smartServiceUserService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = { "password" })
@Getter
@Setter
public class User extends BaseEntity {

	private String fisrtName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	private Role role;
	
}
