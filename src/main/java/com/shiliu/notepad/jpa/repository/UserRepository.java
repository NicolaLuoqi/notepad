package com.shiliu.notepad.jpa.repository;

import com.shiliu.notepad.common.basejpa.BaseRepository;
import com.shiliu.notepad.jpa.entity.UserEntity;

public interface UserRepository extends BaseRepository<UserEntity,String> {

    UserEntity findByUserName(String userName);

    UserEntity findByUserNo(String userNo);
}
