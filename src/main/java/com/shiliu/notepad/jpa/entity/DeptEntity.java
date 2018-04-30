package com.shiliu.notepad.jpa.entity;

import com.shiliu.notepad.common.basejpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sys_dept")
@Getter
@Setter
public class DeptEntity extends BaseEntity {

    private String deptNo;

    private String deptName;

    @ManyToOne
    private DeptEntity deptEntity;
}
