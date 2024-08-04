package com.lait.swagger_test.service;

import com.lait.swagger_test.dao.repository.TableTestEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private TableTestEntityRepository tableTestEntityRepository;

    public TestServiceImpl(TableTestEntityRepository tableTestEntityRepository) {
        this.tableTestEntityRepository = tableTestEntityRepository;
    }

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(String string) {
        System.out.println(tableTestEntityRepository.count());
        return string + "hello";
    }
}
