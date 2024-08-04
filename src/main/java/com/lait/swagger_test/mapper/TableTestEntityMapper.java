package com.lait.swagger_test.mapper;

import com.lait.swagger_test.dao.entity.TableTestEntity;
import com.lait.swagger_test.dto.TableTestEntityDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TableTestEntityMapper {
    TableTestEntity toEntity(TableTestEntityDto tableTestEntityDto);

    TableTestEntityDto toDto(TableTestEntity tableTestEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TableTestEntity partialUpdate(TableTestEntityDto tableTestEntityDto, @MappingTarget TableTestEntity tableTestEntity);
}