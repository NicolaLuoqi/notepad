package com.shiliu.notepad.jpa.entity;

import com.shiliu.notepad.common.basejpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_role")
@Getter
@Setter
public class RoleEntity extends BaseEntity {

    private String roleNo;

    private String roleName;
}
