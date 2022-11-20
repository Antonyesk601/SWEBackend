package com.backend.backend.model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserInterface {
    
    @GetMapping("/User/{ID}")
    public User getUser (@PathVariable String ID)
    {
        return new User();
    }   
}
