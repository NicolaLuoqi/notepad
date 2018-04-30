package com.shiliu.notepad.service.Impl;

import com.shiliu.notepad.common.entitysTodtos.UserCast;
import com.shiliu.notepad.dto.UserDto;
import com.shiliu.notepad.jpa.entity.UserEntity;
import com.shiliu.notepad.jpa.repository.UserRepository;
import com.shiliu.notepad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getUser(String userNo) {
        if (StringUtils.isEmpty(userNo)){
            userNo="001";
        }
        UserEntity userEntity=userRepository.findByUserNo(userNo);
        if (userEntity==null){
            userEntity=new UserEntity();
            userEntity.setLoginName("admin");
            userEntity.setPassWord("123");
            userEntity.setUserNo("001");
            userRepository.save(userEntity);
        }
        UserDto userDto=new UserDto();
        UserCast.castUserDto(userEntity,userDto);
        return userDto;
    }
}
