package com.lait.swagger_test.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "table_test_entity", schema = "swagger_test", catalog = "test")
public class TableTestEntity {

    @EmbeddedId
    private TableTestEntityPK id;

    @Column(name = "name")
    private String name;

    @Column(name = "money")
    private BigDecimal money;

    @Column(name = "currency")
    private String currency;

    @Column(name = "date")
    private Date date;

}