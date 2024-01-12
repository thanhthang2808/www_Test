package com.example.lab1_maithanhthang.controller;

import com.example.lab1_maithanhthang.model.User;
import com.example.lab1_maithanhthang.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class UserController {
    public static Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllContact(){
        List<User> listContact= userService.findAll();
        if(listContact.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(listContact, HttpStatus.OK);
    }
}
