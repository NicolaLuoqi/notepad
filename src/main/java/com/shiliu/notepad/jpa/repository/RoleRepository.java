package com.shiliu.notepad.jpa.repository;

import com.shiliu.notepad.jpa.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,String> {



}
