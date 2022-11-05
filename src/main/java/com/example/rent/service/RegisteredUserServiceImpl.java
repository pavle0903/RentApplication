package com.example.rent.service;

import com.example.rent.dto.RegisteredUserDTO;
import com.example.rent.model.RegisteredUser;
import com.example.rent.repository.RegisteredUserRepository;
import com.example.rent.service.interfraces.RegisteredUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RegisteredUserServiceImpl implements RegisteredUserService {

    private final RegisteredUserRepository registeredUserRepository;
    private final ModelMapper modelMapper;


    @Override
    public RegisteredUserDTO addUser(RegisteredUserDTO registeredUser) {
        RegisteredUser user = modelMapper.map(registeredUser, RegisteredUser.class);
        //registeredUser.setRoles(roleRepository.findByName(registeredUser.getRole()));
        //registeredUserEntity.setPassword(passwordEncoder.encode(registeredUser.getPassword()));
        registeredUserRepository.save(user);

        return registeredUser;
    }

    @Override
    public RegisteredUserDTO findOne(Integer id) {
        Optional<RegisteredUser> registeredUser = registeredUserRepository.findById(id);
        if(registeredUser.isPresent())
            return modelMapper.map(registeredUser.get(), RegisteredUserDTO.class);

        // pogledaj kasnije ovaj null

        return null;
    }

    @Override
    public List<RegisteredUserDTO> findAll() {
        return registeredUserRepository.findAll().stream().map(i -> modelMapper.map(i, RegisteredUserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public RegisteredUserDTO editUser(RegisteredUserDTO registeredUser) {
        RegisteredUser user = modelMapper.map(registeredUser, RegisteredUser.class);
        //registeredUser.setRoles(roleRepository.findByName(registeredUser.getRole()));
        registeredUserRepository.save(user);
        return registeredUser;
    }

    @Override
    public void deleteUser(Integer id) {

    }
}
