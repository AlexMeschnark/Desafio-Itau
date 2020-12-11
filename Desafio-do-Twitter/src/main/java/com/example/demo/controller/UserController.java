package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
    private HttpServletRequest request;

    @Autowired
    private UserRepository userRepository;
}
