package com.lait.swagger_test.dao.repository;

import com.lait.swagger_test.dao.entity.TableTestEntity;
import com.lait.swagger_test.dao.entity.TableTestEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableTestEntityRepository extends JpaRepository<TableTestEntity, TableTestEntityPK> {

    long count ();

}