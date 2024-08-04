package com.lait.swagger_test.dto;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 * DTO for {@link com.lait.swagger_test.dao.entity.TableTestEntityPK}
 */
@Data
public class TableTestEntityPKDto implements Serializable {
    @NonNull
    String bic;
    @NonNull
    String unp;
}