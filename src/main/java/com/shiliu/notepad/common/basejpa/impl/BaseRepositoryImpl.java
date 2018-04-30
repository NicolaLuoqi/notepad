package com.shiliu.notepad.common.basejpa.impl;

import com.shiliu.notepad.common.basejpa.BaseRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class BaseRepositoryImpl<Entity,ID extends Serializable> extends SimpleJpaRepository<Entity,ID>
        implements BaseRepository<Entity,ID>{

    public BaseRepositoryImpl(JpaEntityInformation<Entity, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
    }


    /**
     * 获取所有实体的个数
     *
     * @param entity
     * @return
     */
    @Override
    public long count(Entity entity) {
        return count(getExample(entity));
    }

    /**
     * 获取所有的实体
     *
     * @param entity
     * @return
     */
    @Override
    public List<Entity> findAll(Entity entity) {
        return findAll(getExample(entity));
    }

    /**
     * 获取分页的所有实体
     *
     * @param entity
     * @param pageable
     * @return
     */
    @Override
    public Page<Entity> findAll(Entity entity, Pageable pageable) {
        return findAll(getExample(entity), pageable);
    }

    /**
     * 获取所有实体，并且按照排序排列。
     *
     * @param entity
     * @param sort
     * @return
     */
    @Override
    public List<Entity> findAll(Entity entity, Sort sort) {
        return findAll(getExample(entity),sort);
    }

    /**
     * 获取单个实体
     *
     * @param entity
     * @return
     */
    @Override
    public Entity findOne(Entity entity) {
        List<Entity> entities=findAll(getExample(entity));
        return entities.get(0);
    }

    private Example<Entity> getExample(Entity entity) {
        Example<Entity> example = Example.of(entity);
        return example;
    }
}
