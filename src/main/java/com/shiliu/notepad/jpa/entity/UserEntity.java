package com.shiliu.notepad.jpa.entity;

import com.shiliu.notepad.common.basejpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
@Getter
@Setter
public class UserEntity extends BaseEntity {

    private String userNo;
    private String userName;
    private String loginName;
    private String passWord;
    private boolean stats;

    @ManyToOne
    private RoleEntity roleEntity;

    @ManyToOne
    private DeptEntity deptEntity;

}
