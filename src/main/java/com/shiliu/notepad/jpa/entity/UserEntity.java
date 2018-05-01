package com.shiliu.notepad.jpa.entity;

import com.shiliu.notepad.common.basejpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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

    /**
     * 用户和角色的多对多
     * 需要有一个关联表来保存多对多关联关系，一个用户可以拥有多个角色
     * 多个用户可以拥有相同的角色，所以设计个关联表，
     */
    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
    @JoinTable(name = "sys_user_role",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },inverseJoinColumns = {@JoinColumn(name = "roles_id")})
    private List<RoleEntity> roles;


    @ManyToOne
    private DeptEntity deptEntity;

}
