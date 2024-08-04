package com.lait.swagger_test.controller;

import com.lait.swagger_test.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class TestController {

    private final TestServiceImpl testServiceImpl;

    @GetMapping("/hello")
    public String hello() {
        return testServiceImpl.hello();
    }

    @PostMapping("/hello")
    public String hello(@RequestParam (value = "name", defaultValue = "World") String name) {
        return testServiceImpl.hello(name);
    }

}
