package com.lait.swagger_test.controller;

import com.lait.swagger_test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return testService.hello();
    }

    @PostMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return testService.hello(name);
    }

}
