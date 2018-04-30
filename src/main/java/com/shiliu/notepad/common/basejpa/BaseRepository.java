package com.shiliu.notepad.common.basejpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<Entity,ID extends Serializable>
        extends JpaRepository<Entity,ID>,JpaSpecificationExecutor<Entity>{
    /**
     * 获取所有实体的个数
     *
     * @param entity
     * @return
     */
    long count(Entity entity);

    /**
     * 获取所有的实体
     *
     * @param entity
     * @return
     */
    List<Entity> findAll(Entity entity);

    /**
     * 获取分页的所有实体
     *
     * @param entity
     * @param pageable
     * @return
     */
    Page<Entity> findAll(Entity entity, Pageable pageable);

    /**
     * 获取所有实体，并且按照排序排列。
     *
     * @param entity
     * @param sort
     * @return
     */
    List<Entity> findAll(Entity entity, Sort sort);

    /**
     * 获取单个实体
     *
     * @param entity
     * @return
     */
    Entity findOne(Entity entity);
}
