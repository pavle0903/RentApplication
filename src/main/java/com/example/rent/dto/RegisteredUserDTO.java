package com.example.rent.dto;

import com.example.rent.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredUserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Car rentedCar;
}
