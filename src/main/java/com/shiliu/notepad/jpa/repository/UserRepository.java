package com.shiliu.notepad.jpa.repository;

import com.shiliu.notepad.jpa.entity.UserEntity;
import com.shiliu.notepad.jpa.repository.expand.ExpandJpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {

    UserEntity findByUserName(String userName);

    UserEntity findByUserNo(String userNo);
}
