package com.lait.swagger_test.service;

import com.lait.swagger_test.dao.repository.TableTestEntityRepository;
import com.lait.swagger_test.dto.TableTestDto;
import com.lait.swagger_test.mapper.TableTestEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TableTestEntityRepository tableTestEntityRepository;
    private final TableTestEntityMapper tableTestEntityMapper;

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(String string) {
        System.out.println(tableTestEntityRepository.count());
        return string + "hello";
    }

    @Override
    public String save(TableTestDto tableTestDto) {
        tableTestEntityRepository.save(tableTestEntityMapper.toEntity(tableTestDto));
        return "success";
    }


}
