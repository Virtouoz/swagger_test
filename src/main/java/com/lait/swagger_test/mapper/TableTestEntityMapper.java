package com.lait.swagger_test.mapper;

import com.lait.swagger_test.dao.entity.TableTestEntity;
import com.lait.swagger_test.dto.TableTestDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TableTestEntityMapper {
    TableTestEntity toEntity(TableTestDto tableTestDto);

    TableTestDto toDto(TableTestEntity tableTestEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TableTestEntity partialUpdate(TableTestDto tableTestDto, @MappingTarget TableTestEntity tableTestEntity);
}