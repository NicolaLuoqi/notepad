package com.shiliu.notepad.client;

import com.shiliu.notepad.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "user")
public interface UserClient {

    @GetMapping(value = "getUser")
    UserDto getUser(@RequestParam("userNo")String userNo);
}
