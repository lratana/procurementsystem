package com.procurementsystem.procurementsystem.model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BaseEntity {
    @Column(name = "create_by")
    private String createBy;
    @Column(name="create_at",insertable=false,updatable=false)
    private Date createAt;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "update_at",insertable = false,updatable = true)
    private Date updateAt;
}
