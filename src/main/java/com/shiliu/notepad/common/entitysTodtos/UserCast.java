package com.shiliu.notepad.common.entitysTodtos;

import com.shiliu.notepad.dto.UserDto;
import com.shiliu.notepad.jpa.entity.DeptEntity;
import com.shiliu.notepad.jpa.entity.UserEntity;

public class UserCast {

    public static void castUserDto(UserEntity userEntity,UserDto userDto){
        userDto.setUserNo(userEntity.getUserNo());
        userDto.setUserName(userEntity.getUserName());
        userDto.setPassword(userEntity.getPassWord());
        userDto.setEnable(userEntity.isStats());
        DeptEntity deptEntity=userEntity.getDeptEntity();
        if (deptEntity!=null){
            userDto.setDeptName(deptEntity.getDeptName());
        }

    }
}
