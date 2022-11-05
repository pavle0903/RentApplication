package com.example.rent.controller;


import com.example.rent.dto.RegisteredUserDTO;
import com.example.rent.service.interfraces.RegisteredUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class RegisteredUserController {

    private final RegisteredUserService userService;

    @GetMapping("")
    public ResponseEntity<Iterable<RegisteredUserDTO>> getAll() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegisteredUserDTO> getUserById(@PathVariable("id") Integer id){
        return new ResponseEntity<>(userService.findOne(id), HttpStatus.OK);
    }

    @PostMapping("")
    public RegisteredUserDTO registerUser(@RequestBody RegisteredUserDTO userDTO){
       return userService.addUser(userDTO);
    }
}
