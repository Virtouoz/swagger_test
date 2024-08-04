package com.lait.swagger_test.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class TableTestEntityPK implements Serializable {

    @Column(name = "bic", nullable = false)
    private String bic;
    @Column(name = "unp", nullable = false)
    private String unp;

}