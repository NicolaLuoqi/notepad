package com.shiliu.notepad.jpa.entity;

import com.shiliu.notepad.common.basejpa.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "sys_menu")
@Getter
@Setter
public class MenuEntity extends BaseEntity{

    private String meneNo;

    private String menuName;

    private String menuPath;

    private boolean enable;

    @OneToMany
    private Set<RoleEntity> roleEntities;

    @ManyToOne
    private MenuEntity menuEntity;

}
