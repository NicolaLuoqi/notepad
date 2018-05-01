package com.shiliu.notepad.service.Impl;

import com.shiliu.notepad.jpa.entity.RoleEntity;
import com.shiliu.notepad.jpa.repository.RoleRepository;
import com.shiliu.notepad.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void initRole(RoleEntity roleEntity) {



    }
}
