package com.shiliu.notepad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable{

    private String userName;

    private String userNo;

    private String password;

    private boolean enable;

    private String deptName;
}
