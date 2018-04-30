package com.shiliu.notepad.controller;

import com.shiliu.notepad.client.UserClient;
import com.shiliu.notepad.dto.UserDto;
import com.shiliu.notepad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserClient{

    @Autowired
    private UserService userService;

    @Override
    public UserDto getUser(String userNo) {
        return userService.getUser(userNo);
    }
}
