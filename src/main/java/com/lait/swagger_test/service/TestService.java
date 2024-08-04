package com.lait.swagger_test.service;

import com.lait.swagger_test.dto.TableTestDto;

public interface TestService {

    String hello(String string);

    String hello();

    String save(TableTestDto tableTestDto);

}
