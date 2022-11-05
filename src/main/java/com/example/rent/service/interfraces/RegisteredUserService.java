package com.example.rent.service.interfraces;

import com.example.rent.dto.RegisteredUserDTO;
import com.example.rent.model.RegisteredUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RegisteredUserService {

    RegisteredUserDTO addUser(RegisteredUserDTO registeredUser);

    RegisteredUserDTO findOne(Integer id);

    List<RegisteredUserDTO> findAll();

    RegisteredUserDTO editUser(RegisteredUserDTO registeredUser);

    void deleteUser(Integer id);
}
