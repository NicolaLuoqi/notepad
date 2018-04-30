package com.shiliu.notepad.common.basejpa;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable{

    private static final long serialVersionUID=2908475640374886321L;

    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid.hex")
    private String id;

    private String name;

    @Version
    private Timestamp timeVersion;

    private Boolean deleteFlag=false;

    @CreationTimestamp
    private Timestamp createTime;

    private String createUserId;

    @UpdateTimestamp
    private Timestamp updateTime;

    private String updateUserId;

}
