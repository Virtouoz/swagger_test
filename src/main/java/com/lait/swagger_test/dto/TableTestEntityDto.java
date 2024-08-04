package com.lait.swagger_test.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * DTO for {@link com.lait.swagger_test.dao.entity.TableTestEntity}
 */
@Data
public class TableTestEntityDto implements Serializable {
    TableTestEntityPKDto id;
    String name;
    BigDecimal money;
    String currency;
    Date date;
}